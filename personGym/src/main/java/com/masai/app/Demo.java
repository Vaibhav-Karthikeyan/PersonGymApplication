package com.masai.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.app.config.Config;
import com.masai.app.service.PersonService;


public class Demo {
	
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
		PersonService ps=ctx.getBean(PersonService.class);
		ps.printMap();
		ps.printList();
		ps.printAppName();
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
