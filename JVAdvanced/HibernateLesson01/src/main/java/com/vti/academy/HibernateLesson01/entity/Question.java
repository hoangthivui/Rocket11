package com.vti.academy.HibernateLesson01.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import com.vti.academy.HibernateLesson01.entity.enumerate.typeConvert;

@Entity
@Table(name = "Question", catalog = "TestingSystem")
public class Question implements Serializable  {

private static final long serialVersionUID = 1L;
	
	@Column(name= "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "type", nullable = false)
	@ColumnDefault("Multiple-Choice")
	@Convert(converter = typeConvert.class)
	private String type;
	
	@Column(name = "status")
	@ColumnDefault("0")
	private Boolean status;
	
	@Column(name = "version", nullable = false)
	@ColumnDefault("1")
	private short version;

	@Column(name = "create_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createTime;
	
	public Question() {		
	}
	public short getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public Boolean getStatus() {
		return status;
	}

	public short getVersion() {
		return version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setId(short id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void setVersion(short version) {
		this.version = version;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", type=" + type + ", status=" + status + ", version="
				+ version + ", createTime=" + createTime + "]";
	}
	

}
