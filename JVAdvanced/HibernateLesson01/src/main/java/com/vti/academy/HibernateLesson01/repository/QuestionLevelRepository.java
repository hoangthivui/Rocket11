package com.vti.academy.HibernateLesson01.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.academy.HibernateLesson01.entity.QuestionLevel;

import utils.HibernateUtils;

public class QuestionLevelRepository {

	private HibernateUtils hibernateUtils;

	public QuestionLevelRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<QuestionLevel> getAllQuestionLevel() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<QuestionLevel> query = session.createQuery("FROM QuestionLevel");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
