package com.coding.others;

public class t extends PrivateMemberExample{
	public static void main(String[] args) {
		t tt = new t();
		tt.privateMethod();
		//tt.privateMethod();
	}
	
	//method hiding ,, we cant override private static methods
	static void privateMethod() {
		System.out.println("static method of Outer Class");
	}
	
//	private void privateMethod() {
//		System.out.println("Private method of Outer Class");
//	}
}
