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
        //创建一个Spring容器
 		ApplicationContext act = new ClassPathXmlApplicationContext("appicationContext.xml");
 		//就获取id为person的Bean
 		Person p = act.getBean("person",Person.class);
 		p.useAxe();
	}

}
