package com.solid;
class Student  
{  
	private double height;  
	private double weight;  
	public void setHeight(double h)   
	{   
		height = h;   
	}  
	public void setWeight(double w)   
	{   
		weight= w;   
	}  
}  
public class StudentBMI extends Student  
{  
	public void setHeight(double h)   
	{  
		super.setHeight(h);  
		super.setWeight(2);  
	}  
	public void setWeight(double h)   
	{  
		super.setHeight(h);  
		super.setWeight(3);  
	}  
}  
