package com.vti.academy.HibernateLesson01.Test;

import java.util.List;
import com.vti.academy.HibernateLesson01.entity.Group;
import com.vti.academy.HibernateLesson01.repository.GroupRepository;

public class GroupTest {

	public static void main( String[] args )
    {GroupRepository repository = new GroupRepository();

	System.out.println("***********GET ALL GROUP***********");

	List<Group> groups = repository.getAllGroup();

	for (Group group : groups) {
		System.out.println(group);
	}
	}

}
