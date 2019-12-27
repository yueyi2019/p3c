package com.p3c.oop;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("1", new Son("erzi"));
		Person p2 = (Person)p1.clone();
		p2.getSon().setSonName("儿子");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
class Person implements Cloneable{
	private String name;
	private Son son;
	
	public Person(String name, Son son) {
		this.name = name;
		this.son = son;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Son getSon() {
		return son;
	}
	public void setSon(Son son) {
		this.son = son;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// 调用父clone
//		return super.clone();
		
		// 自定义克隆
		Person p = (Person)super.clone();
		p.setSon((Son)p.getSon().clone());
		return p;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", son=" + son.toString() + "]";
	}
	
}
class Son implements Cloneable {
	private String sonName;

	public Son(String sonName) {
		
		this.sonName = sonName;
	}

	public String getSonName() {
		return sonName;
	}

	public void setSonName(String sonName) {
		this.sonName = sonName;
	}

	@Override
	public String toString() {
		return "Son [sonName=" + sonName + "]";
	}
	
	// FIXME
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		return super.clone();
	}
	
}