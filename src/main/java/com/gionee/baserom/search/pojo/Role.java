package com.gionee.baserom.search.pojo;

public class Role {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.enable
	 * @mbggenerated
	 */
	private Integer enable;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.role_name
	 * @mbggenerated
	 */
	private String roleName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.role_key
	 * @mbggenerated
	 */
	private String roleKey;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column role.description
	 * @mbggenerated
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.id
	 * @return  the value of role.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.id
	 * @param id  the value for role.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.enable
	 * @return  the value of role.enable
	 * @mbggenerated
	 */
	public Integer getEnable() {
		return enable;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.enable
	 * @param enable  the value for role.enable
	 * @mbggenerated
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.role_name
	 * @return  the value of role.role_name
	 * @mbggenerated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.role_name
	 * @param roleName  the value for role.role_name
	 * @mbggenerated
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.role_key
	 * @return  the value of role.role_key
	 * @mbggenerated
	 */
	public String getRoleKey() {
		return roleKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.role_key
	 * @param roleKey  the value for role.role_key
	 * @mbggenerated
	 */
	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey == null ? null : roleKey.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column role.description
	 * @return  the value of role.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column role.description
	 * @param description  the value for role.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}