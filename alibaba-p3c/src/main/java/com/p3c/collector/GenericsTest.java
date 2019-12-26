package com.p3c.collector;
import java.util.*;
public class GenericsTest {
	public static void main(String[] args) {
		
		List<? extends Animal> list = new ArrayList<Animal>();
		// 下面编译错误
//		list.add(new Dog());
		
		// 下面编译正确
//		Animal animal = list.get(0);
		
		// 下面编译正确，但实际不正确，因为泛型只是期望
//		List<Dog> animal = getAnimal();
		
		
		List<String> generics = null;
		List notGenerics = new ArrayList(10);
		notGenerics.add(new Object());
		notGenerics.add(new Integer(1));
		generics = notGenerics;
		// 此处抛出 ClassCastException 异常
//		String string = generics.get(0);
		Object o = generics.get(0);
//		Integer i = (Integer)generics.get(1);
	}
	
	public static List getAnimal() {
		return new ArrayList<Animal>();
	}
	
	class Animal{}
	class Dog extends Animal{}
	class Cat extends Animal{}
}
