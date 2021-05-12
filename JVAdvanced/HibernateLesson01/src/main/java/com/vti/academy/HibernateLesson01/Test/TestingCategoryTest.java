package com.vti.academy.HibernateLesson01.Test;

import java.util.List;

import com.vti.academy.HibernateLesson01.entity.TestingCategory;
import com.vti.academy.HibernateLesson01.repository.TestingCategoryRepository;

public class TestingCategoryTest {

	public static void main( String[] args )
    {TestingCategoryRepository repository = new TestingCategoryRepository();

	System.out.println("***********GET ALL TESTING CATEGORY***********");

	List<TestingCategory> TestingCategorys = repository.getAllTestingCategory();

	for (TestingCategory testingCategory : TestingCategorys) {
		System.out.println(testingCategory);
	}
	}
}
