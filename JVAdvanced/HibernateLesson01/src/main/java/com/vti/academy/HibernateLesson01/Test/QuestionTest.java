package com.vti.academy.HibernateLesson01.Test;

import java.util.List;

import com.vti.academy.HibernateLesson01.entity.Question;
import com.vti.academy.HibernateLesson01.repository.QuestionRepository;

public class QuestionTest {

	public static void main( String[] args )
    {QuestionRepository repository = new QuestionRepository();

	System.out.println("***********GET ALL QUESTION ***********");

	List<Question> questions = repository.getAllQuestion();

	for (Question question : questions) {
		System.out.println(question);
	}
	}
}
