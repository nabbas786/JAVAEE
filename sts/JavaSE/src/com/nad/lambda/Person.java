package com.nad.lambda;

public class Person {

	String name;
	Integer age;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Person(String name) {
		this.name=name;
	}
	public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }
	@Override
	protected Person clone() throws CloneNotSupportedException {
		return new Person(this.name,this.age,this.gender);
	}
}
