package com.vti.academy.HibernateLesson01.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Question_Level", catalog = "TestingSystem")
public class QuestionLevel implements Serializable  {

private static final long serialVersionUID = 1L;
	
	@Column(name= "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "level", nullable = false, length = 20)
	private String level;

	public QuestionLevel() {
		
	}

	public short getId() {
		return id;
	}

	public String getLevel() {
		return level;
	}

	public void setId(short id) {
		this.id = id;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "QuestionLevel [id=" + id + ", level=" + level + "]";
	}
	
	
}
