package com.vti.academy.entity;

import com.vti.academy.backend.Student_Exercise1;

public final class PrimaryStudent extends Student_Exercise1 {

	private static int countprimary=0;
	
	public PrimaryStudent(String name) {
		super(counter, name);
		countprimary++;
	}
	

}
