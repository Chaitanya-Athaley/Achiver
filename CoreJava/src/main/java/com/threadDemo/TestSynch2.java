package com.threadDemo;

//example of java synchronized method  
class Tablee{  
	synchronized void printTable(int n){//synchronized method  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){System.out.println(e);}  
		}  

	}  
}  

class MyThreadA extends Thread{  
	Tablee t;  
	MyThreadA(Tablee t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  

}  
class MyThreadB extends Thread{  
	Tablee t;  
	MyThreadB(Tablee t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  

public class TestSynch2{  
	public static void main(String args[]){  
		Tablee obj = new Tablee();//only one object  
		MyThreadA t1=new MyThreadA(obj);  
		MyThreadB t2=new MyThreadB(obj);  
		t1.start();  
		t2.start();  
	}  
}  
