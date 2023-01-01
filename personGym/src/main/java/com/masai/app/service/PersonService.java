package com.masai.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.masai.app.entity.Gym;
import com.masai.app.entity.Person;

@Service
public class PersonService {
	@Autowired
	private Map<Person,Gym> theMap;
	
	@Autowired
	private List<Person> theList;
	
	@Value("${appName}")
	private String appName;
	
	public void printMap(){
		System.out.println("Printing the map");
		theMap.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " - " + entry.getValue());  
		});
	}
	
	public void printList() {
		System.out.println("Printing the list");
		theList.forEach(System.out::println);
	}
	
	public void printAppName() {
		System.out.println("Printing the appname");
		System.out.println(appName);
	}
}
