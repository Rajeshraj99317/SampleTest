package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c=new 
		ClassPathXmlApplicationContext("config.xml");
	    Object ob=c.getBean("empObj");
	
	    Employee e=(Employee)ob;
	    System.out.println(e);
	    

}
}