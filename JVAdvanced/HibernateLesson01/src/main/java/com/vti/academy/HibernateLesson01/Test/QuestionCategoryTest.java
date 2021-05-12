package com.vti.academy.HibernateLesson01.Test;

import java.util.List;

import com.vti.academy.HibernateLesson01.entity.QuestionCategory;
import com.vti.academy.HibernateLesson01.repository.QuestionCategoryRepository;



public class QuestionCategoryTest {

	public static void main( String[] args )
    {QuestionCategoryRepository repository = new QuestionCategoryRepository();

	System.out.println("***********GET ALL QUESTION CATEGORY***********");

	List<QuestionCategory> questionCategorys = repository.getAllQuestionCategory();

	for (QuestionCategory questionCategory : questionCategorys) {
		System.out.println(questionCategory);
	}
	}
}
