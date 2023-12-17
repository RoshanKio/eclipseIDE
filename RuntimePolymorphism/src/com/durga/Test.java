package com.durga;

import java.lang.reflect.InvocationTargetException;


public class Test {
	public static void main(String my[]) {
		A a = null;
		
		try {
			a = (A)Class.forName("com.durga."+my[0]).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a);
	}
}
