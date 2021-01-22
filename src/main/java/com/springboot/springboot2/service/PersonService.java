package com.springboot.springboot2.service;

import java.util.List;

import com.springboot.springboot2.entity.Person;

public interface PersonService {
	public List<Person> getAll();

    public Person getPersonByID(int id);

    public void  delete(int id);

    public void update(Person p);

    public void newp(Person p);
}
