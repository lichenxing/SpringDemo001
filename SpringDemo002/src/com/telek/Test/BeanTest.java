package com.telek.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telek.dao.Person;

public class BeanTest {

	public static void main(String[] args) {
		ApplicationContext axt = new ClassPathXmlApplicationContext("appicationContext.xml");
		Person p = axt.getBean("personImpl",Person.class);
		p.useAxe();

	}

}
