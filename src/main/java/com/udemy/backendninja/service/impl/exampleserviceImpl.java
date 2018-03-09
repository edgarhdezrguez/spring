package com.udemy.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.model.Person;
import com.udemy.backendninja.service.exampleservice;

@Service("exampleService")
public class exampleserviceImpl implements exampleservice{

		private static final Log LOG = LogFactory.getLog(exampleserviceImpl.class);
	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Jon",23));
		people.add(new Person("Eva",27));
		people.add(new Person("Pedro",26));
		people.add(new Person("Javier",35));
		people.add(new Person("Carl",29));
		people.add(new Person("Mikel",24));
		people.add(new Person("Xavier",25));
		LOG.info("HELLO FROM SERVICE");
		return people;
	}

}
