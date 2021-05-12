package com.vti.academy.HibernateLesson01.repository;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.academy.HibernateLesson01.entity.User;

import utils.HibernateUtils;

public class UserRepository {

	private HibernateUtils hibernateUtils;

	public UserRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<User> query = session.createQuery("FROM User");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public User getUserByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			User user = session.get(User.class, id);

			return user;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	@SuppressWarnings("unchecked")
//	public User getUserByName(String name) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//
//			// create hql query
//			Query<User> query = session.createQuery("FROM User WHERE name = :nameParameter");
//
//			// set parameter
//			query.setParameter("nameParameter", name);
//
//			// get result
//			User user = query.uniqueResult();
//
//			return user;
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}
//
	public void createUser(User user) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(user);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateUser(short id, String newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get department
//			User user = (User) session.load(User.class, id);
//
//			// update
//			user.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}
//
//	public void updateUser(User user) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// update
//			session.update(user);
//
//			session.getTransaction().commit();
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}
//
//	public void deleteUser(short id) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get department
//			User user = (User) session.load(User.class, id);
//
//			// delete
//			session.delete(user);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}
//
//	public boolean isUserExistsByID(short id) {
//
//		// get department
//		User user = getUserByID(id);
//
//		// return result
//		if (user == null) {
//			return false;
//		}
//
//		return true;
//	}
//
//	public boolean isDepartmentExistsByName(String name) {
//		User department = getUserByName(name);
//
//		if (department == null) {
//			return false;
//		}
//		return true;
//	}

}
