/**
 * 
 */
package com.telek.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telek.bean.Person;

/**
 * @author Administrator
 *
 */
public class FirstSpringTest {


 	public static void main(String[] args) {
        //����һ��Spring����
 		ApplicationContext act = new ClassPathXmlApplicationContext("appicationContext.xml");
 		//�ͻ�ȡidΪperson��Bean
 		Person p = act.getBean("person",Person.class);
 		p.useAxe();
	}

}
