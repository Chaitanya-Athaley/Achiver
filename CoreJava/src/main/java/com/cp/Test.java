package com.cp;

public class Test {

	public static void main(String[] args) {
		//System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		try {
			String  bo = null;
			bo.toUpperCase();
			System.exit(0);
			System.out.println("I am in try");
		} catch (Exception e) {
			System.exit(0);
			System.out.println("----------");
			System.out.println("I am in Catch");
			
		}finally {
			System.out.println("I am in Finally");
		}
	}

}
