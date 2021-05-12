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

import org.hibernate.annotations.CreationTimestamp;

import com.vti.academy.HibernateLesson01.entity.enumerate.Gender;
import com.vti.academy.HibernateLesson01.entity.enumerate.genderConvert;


@Entity
@Table(name = "User", catalog = "TestingSystem")
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name= "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "username", unique = true, nullable = false, length = 50)
	private String name;
	
	@Column(name ="email", unique = true, nullable = false, length = 50)
	private String email;
	
	@Column(name ="password", nullable = false)
	private String password;
	
	@Column(name ="firstName", nullable = false)
	private String firstName;
	
	@Column(name ="lastName", nullable = false)
	private String lastName;
	
	@Column(name ="gender", nullable = false)
	@Convert(converter = genderConvert.class)
	private Gender gender;
	
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	@Column(name ="date_Of_Birth", nullable = false)
	private Date date_Of_Birth;
	
	@Column(name ="address", length = 100, nullable = false)
	private String address;
	
	@Column(name ="phone", nullable = false, length = 15, unique = true)
	private String phone;
//	
//	@Column(name ="role")
//	private Role role;
	public User() {
		
	}

	public short getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
	
//	public Role getRole() {
//		return role;
//	}

	public void setId(short id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
//	public void setRole(Role role) {
//	this.role = role;
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", date_Of_Birth=" + date_Of_Birth
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
}
