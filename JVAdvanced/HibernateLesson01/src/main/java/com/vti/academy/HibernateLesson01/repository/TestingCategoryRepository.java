package com.vti.academy.HibernateLesson01.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.academy.HibernateLesson01.entity.TestingCategory;

import utils.HibernateUtils;

public class TestingCategoryRepository {

	private HibernateUtils hibernateUtils;

	public TestingCategoryRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<TestingCategory> getAllTestingCategory() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<TestingCategory> query = session.createQuery("FROM TestingCategory");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}


}
