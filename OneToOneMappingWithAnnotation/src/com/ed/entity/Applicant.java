package com.ed.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Applicant 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="Application_Id")
	private int applicantId;
	
	@Column(name="Name")
   private String name;
	
   @Column(name="Age")
   private int age;
   
   @Column(name="City")
   private String city;
   @OneToOne(mappedBy="applicant",cascade=CascadeType.ALL)
   private Passport passport;

public Passport getPassport() {
	return passport;
}

public void setPassport(Passport passport) {
	this.passport = passport;
}

public int getApplicantId() {
	return applicantId;
}

public void setApplicantId(int applicantId) {
	this.applicantId = applicantId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
   
   
}
