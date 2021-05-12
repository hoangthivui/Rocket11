package com.vti.academy.HibernateLesson01.entity.enumerate;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class typeConvert implements AttributeConverter<Type, String>{

	public String convertToDatabaseColumn(Type t) {
		if(t==null) {
			return null;
		}
		return t.getValue();
	}

	public Type convertToEntityAttribute(String value) {
		return Type.of(value);
	}

}
