package com.masai.app.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.masai.app.entity.Gym;
import com.masai.app.entity.Person;

@Configuration
@ComponentScan(basePackages="com.masai")
@PropertySource("appname.properties")
public class Config {
	@Bean("p1")
	public Person newPerson1() {
		Person p=new Person(1,"vaibhav","vaibhav@gmail.com",21,"9876543210");
		return p;
	}
	@Bean("p2")
	public Person newPerson2() {
		Person p=new Person(2,"ram","ram@gmail.com",22,"9876543210");
		return p;
	}
	@Bean("p3")
	public Person newPerson3() {
		Person p=new Person(3,"shyam","shyam@gmail.com",23,"9876543210");
		return p;
	}
	@Bean("p4")
	public Person newPerson4() {
		Person p=new Person(4,"hannah","hannah@gmail.com",21,"9876543210");
		return p;
	}
	@Bean("p5")
	public Person newPerson5() {
		Person p1=new Person(5,"ramu","ramu@gmail.com",22,"9876543210");
		return p1;
	}
	
	@Bean("g1")
	public Gym newGym1() {
		Gym g=new Gym(1,"gym1",1000.00);
		return g;
	}
	@Bean("g2")
	public Gym newGym2() {
		Gym g=new Gym(2,"gym2",2000.00);
		return g;
	}
	@Bean("g3")
	public Gym newGym3() {
		Gym g=new Gym(3,"gym3",3000.00);
		return g;
	}
	
	@Bean("theMap")
	public Map<Person,Gym> newMap(){
		Map<Person,Gym> theMap=new HashMap<>();
		theMap.put(newPerson1(), newGym1());
		theMap.put(newPerson2(), newGym2());
		theMap.put(newPerson3(), newGym3());
		return theMap;
	}
	
	@Bean("theList")
	public List<Person> newList(){
		List<Person> theList=new ArrayList<>();
		theList.add(newPerson1());
		theList.add(newPerson2());
		theList.add(newPerson3());
		theList.add(newPerson4());
		theList.add(newPerson5());
		return theList;
	}
}
