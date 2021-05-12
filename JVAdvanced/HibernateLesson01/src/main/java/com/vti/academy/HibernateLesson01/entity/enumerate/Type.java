package com.vti.academy.HibernateLesson01.entity.enumerate;

public enum Type {
	MULTIPLECHOICE("Multiple-Choice"), ESSAY("essay");
	
private String value;
	
	private Type(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	public static Type of(String value) {
		if(value == null) {
			return null;
		}
		for (Type t : Type.values()) {
			if(t.getValue().equals(value)) {
				return t;
			}
		}
		return null;
	}
	
}
