package com.ramirez.spring.test.testprog;

public class Person {
	private int id;
	private String name;
	
	private int taxId;

	public Person()
	{
		
	}
	
	Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}

	public void speak()
	{
		System.out.println("Hello, im a person");
	}
	
	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
}
