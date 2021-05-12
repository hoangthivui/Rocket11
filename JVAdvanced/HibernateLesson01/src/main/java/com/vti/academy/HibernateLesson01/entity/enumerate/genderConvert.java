package com.vti.academy.HibernateLesson01.entity.enumerate;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class genderConvert implements AttributeConverter<Gender, String>{

	public String convertToDatabaseColumn(Gender g) {
		if(g==null) {
			return null;
		}
		return g.getValue();
	}

	public Gender convertToEntityAttribute(String value) {
		return Gender.of(value);
	}

}
