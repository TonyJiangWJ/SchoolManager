package com.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 实体对象的基类 包含id 创建时间 修改时间 版本
 * @author 江文杰
 *
 */
public class BaseEntity implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Integer version;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}
