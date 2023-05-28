package com.jspiders.multhreading.my;

public class singletonDemo {

	static singletonDemo Obj=new singletonDemo();
	int count;
	
	private singletonDemo() {
		count++;
		System.out.println("object created"+count+"times.");
	}
	public static singletonDemo getobject() {
		return  Obj;
		

	}

}
