package com.gionee.baserom.search.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gionee.baserom.search.dao.AccountMapper;
import com.gionee.baserom.search.dao.ResourcesMapper;
import com.gionee.baserom.search.pojo.Account;
import com.gionee.baserom.search.pojo.Resources;

/**
 * 该类实现 UserDetails 接口，该类在验证成功后会被保存在当前回话的principal对象中
 * 
 * 获得对象的方式：
 * WebUserDetails webUserDetails = (WebUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 * 
 * 或在JSP中：
 * <sec:authentication property="principal.accountName"/>
 * 
 * 如果需要包括用户的其他属性，可以实现 UserDetails 接口中增加相应属性即可
 * 权限验证类
 */
@Service
public class GioneeUserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	private AccountMapper accountMapper;
	@Autowired
	private ResourcesMapper resourcesMapper;
	// 登录验证
	public UserDetails loadUserByUsername(String accountName) throws UsernameNotFoundException {
		//取得用户的权限
		Account account = accountMapper.queryByAccountName(accountName);
		if(account==null){
            throw new UsernameNotFoundException("账号----------> "+accountName + " 不存在");
        }  
		Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(account);
		// 封装成spring security的user
		User userdetail = new User(
				account.getName(), 
				account.getPassword(),
				true, 
				true, 
				true,
				true, 
				grantedAuths	//用户的权限
			);
		return userdetail;
	}

	// 取得用户的权限
	private Set<GrantedAuthority> obtionGrantedAuthorities(Account account) {
		List<Resources> resources = resourcesMapper.getAccountResources(String.valueOf(account.getId()));
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		for (Resources res : resources) {
			// TODO:ZZQ 用户可以访问的资源名称（或者说用户所拥有的权限） 注意：必须"ROLE_"开头
			// 关联代码：spring-security.xml
			// 关联代码：GioneeSecurityMetadataSource#loadResourceDefine
			authSet.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}
		return authSet;
	}
}