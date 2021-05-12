package com.vti.academy.HibernateLesson01.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.academy.HibernateLesson01.entity.QuestionCategory;

import utils.HibernateUtils;

public class QuestionCategoryRepository {

	private HibernateUtils hibernateUtils;

	public QuestionCategoryRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<QuestionCategory> getAllQuestionCategory() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<QuestionCategory> query = session.createQuery("FROM QuestionCategory");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
