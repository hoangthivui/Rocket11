package com.vti.academy.HibernateLesson01.entity;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name = "Testing_Category", catalog = "TestingSystem")
public class TestingCategory implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name= "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name="create_time")
	@Temporal(TemporalType.DATE)
	//@CreationTimestamp
	private Date createTime;

	public TestingCategory() {
		
	}

	public short getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setId(short id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "TestingCategory [id=" + id + ", name=" + name + ", createTime=" + createTime + "]";
	}
	
	
}
