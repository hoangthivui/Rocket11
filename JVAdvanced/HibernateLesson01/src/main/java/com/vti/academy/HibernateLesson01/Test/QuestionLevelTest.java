package com.vti.academy.HibernateLesson01.Test;

import java.util.List;

import com.vti.academy.HibernateLesson01.entity.QuestionLevel;
import com.vti.academy.HibernateLesson01.repository.QuestionLevelRepository;


public class QuestionLevelTest {

	
	public static void main( String[] args ) {
		QuestionLevelRepository repository = new QuestionLevelRepository();

	System.out.println("***********GET ALL QUESTION LEVELS***********");

	List<QuestionLevel> QuestionLevels = repository.getAllQuestionLevel();

	for (QuestionLevel questionLevel : QuestionLevels) {
		System.out.println(questionLevel);
	}
	}
}