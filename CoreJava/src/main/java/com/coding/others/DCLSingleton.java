package com.coding.others;

class DCLSingleton {
	private static volatile DCLSingleton _instance = null;
	
	private DCLSingleton() { } 
	
	public static DCLSingleton instance() 
	{ 
		if (_instance == null) { 
			// 1st check 
			synchronized(DCLSingleton.class) 
			{ 
				// 2nd check 
				if (_instance == null) 
				{
					_instance = new DCLSingleton();
				}
			} 
		}
		return _instance;
	} 
}

