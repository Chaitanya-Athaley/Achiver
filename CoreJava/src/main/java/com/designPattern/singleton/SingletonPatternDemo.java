package com.designPattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();

		//Get the only object available
		SingleObject object = SingleObject.getInstance();

		//show the message
		int hashCode = object.hashCode();

		SingleObject object2 = SingleObject.getInstance();
		int hashCode2 = object2.hashCode();

		SingleObject object3 = SingleObject.getInstance();
		int hashCode3 = object3.hashCode();

		SingleObject object4 = SingleObject.getInstance();
		int hashCode4 = object4.hashCode();

		SingleObject inSingleObject = null;
		Constructor[] constructors = SingleObject.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) 
		{
			constructor.setAccessible(true);
			try {
				inSingleObject = (SingleObject) constructor.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		int hashCode5 = inSingleObject.hashCode();
		System.out.println("hashCode1 ::"+hashCode);
		System.out.println("hashCode2 ::"+hashCode2);
		System.out.println("hashCode3 ::"+hashCode3);
		System.out.println("hashCode4 ::"+hashCode4);
		System.out.println("hashCode5 ::"+hashCode5);
	}

}
