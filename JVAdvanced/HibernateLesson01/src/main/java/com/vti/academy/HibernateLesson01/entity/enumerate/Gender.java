package com.vti.academy.HibernateLesson01.entity.enumerate;

public enum Gender {
	MALE("M"),FEMALE("F"),UNKNOW("U");
	
	private String value;
	
	private Gender(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	public static Gender of(String value) {
		if(value == null) {
			return null;
		}
		for (Gender g : Gender.values()) {
			if(g.getValue().equals(value)) {
				return g;
			}
		}
		return null;
	}
	
	
}
