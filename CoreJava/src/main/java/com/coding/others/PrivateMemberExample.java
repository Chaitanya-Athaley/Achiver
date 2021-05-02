package com.coding.others;

public class PrivateMemberExample {

	private String i_m_private = "I am private member, not accessible outside this Class";

	private void privateMethod() {
		System.out.println("Private method of Outer Class");
	}

	public static void main(String args[]) { 
		PrivateMemberExample outerClass = new PrivateMemberExample();
		NestedClass nc = outerClass.new NestedClass();
		nc.showPrivate();
		//shows that private method are accessible in inner class. outerClass = nc; outerClass.privateMethod();
	}


	class NestedClass extends PrivateMemberExample { 
		public void showPrivate() {
			System.out.println("Accessing Private members of Outer class: " + i_m_private);
			privateMethod(); 
		}

		// instead it’s just hiding parent class method.
//		private void privateMethod() { 
//			System.out.println("Private method of Nested Class"); 
//		}

	}


}
