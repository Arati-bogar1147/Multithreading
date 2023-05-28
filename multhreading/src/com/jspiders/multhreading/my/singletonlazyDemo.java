package com.jspiders.multhreading.my;

public class singletonlazyDemo {
	
	static singletonlazyDemo obj;
	static int count;
	
	private singletonlazyDemo() {
		count++;
	}
	public static singletonlazyDemo getobject() {
		if(obj==null) {
			obj=new singletonlazyDemo();
			System.out.println("object created"+count +"times.");
			return obj;
		}
		System.out.println("object created"+count +"times.");
		return obj;
	}

}
