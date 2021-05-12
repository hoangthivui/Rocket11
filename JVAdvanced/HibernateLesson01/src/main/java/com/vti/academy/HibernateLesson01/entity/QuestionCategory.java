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
@Table(name = "Question_Category", catalog = "TestingSystem")
public class QuestionCategory implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Column(name= "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "name", unique = true, nullable = false, length = 50)
	private String name;
	
	@Column(name="create_time")
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	private Date createTime;

	public QuestionCategory() {
		
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
		return "QuestionCategory [id=" + id + ", name=" + name + ", createTime=" + createTime + "]";
	}	
}
