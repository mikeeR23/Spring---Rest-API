package com.ramirez.spring.test.testprog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

	
    public static void main( String[] args )
    {
    	// Bean container. Instantiates beans, which are just regular java objects
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/ramirez/spring/test/testprog/beans/beans.xml");
    	
       Person person = (Person)context.getBean("person");
       person.speak();
       
       System.out.println(person);
       
       ((ClassPathXmlApplicationContext)context).close();
    }
}
