package com.nad.concurrent;

import com.nad.lambda.Person;

public final class Immutable {

	private final Person person;
	private final int id;
	private final String name;
	
	private Immutable(Person person, int id, String name) {
		super();
		this.person = new Person(person.getName(),person.getAge(),person.getGender());
		this.id = id;
		this.name = name;
	}
	public Immutable newInstance(Person person, int id, String name) {
		return new Immutable(person, id, name);
	}
	public Person getPerson() {
		return person;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Immutable [person=" + person.toString() + ", id=" + id + ", name=" + name + "]";
	}
	
}
