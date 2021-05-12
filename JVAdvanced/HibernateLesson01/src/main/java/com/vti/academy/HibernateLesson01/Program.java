package com.vti.academy.HibernateLesson01;

import java.util.List;
import com.vti.academy.HibernateLesson01.entity.User;
import com.vti.academy.HibernateLesson01.repository.UserRepository;

public class Program 
{
    public static void main( String[] args )
    {UserRepository repository = new UserRepository();

	System.out.println("***********GET ALL user***********");

	List<User> users = repository.getAllUser();

	for (User user : users) {
		System.out.println(user);
	}
	}
}
