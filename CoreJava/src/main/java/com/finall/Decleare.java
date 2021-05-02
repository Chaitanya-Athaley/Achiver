package com.finall;

public class Decleare {

	final int x; 
	{ 
		x = 10; 
	} 
	public static void main(String[] args) 
	{ 
		Decleare t = new Decleare(); 
		System.out.println("final block "+t.x); 
		
		Test t2 = new Test(); 
        System.out.println("in Constructor "+t2.x);
	} 
} 

class Test { 
	//Initialize in constructor
    final int x; 
    
    Test() 
    { 
        x = 15; 
    }  
} 

