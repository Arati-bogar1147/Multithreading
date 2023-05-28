package com.jspiders.designpatterns.factory;

import java.util.Scanner;

public class Carshowroom {
	
	static Car Car;
	static boolean loop=true;
	
	public static void main(String[]args) {
		while(loop) {
			try {
				factory().buyCar();
				
			} catch (NullPointerException e) {
				System.out.println("No Car selected");
		
			}
		
	}
		
	}
	private static Car factory() {
		System.out.println("Please select car to buy."+"\n1.Swift\n2.Baleno\n3.Celerio"+"\n4.Brezza\n5.Ertiga\n6.WagonR");
		
		Scanner Sc=new Scanner(System.in);
		int choice=Sc.nextInt();
		
		switch(choice){
		case 1:
			Car=new Swift();
			loop=false;
			break;
			
		case 2:
			Car=new Balero();
			loop=false;
			break;
			
		case 3:
			Car=new Celerio();
			loop=false;
			break;
			
		case 4:
			Car=new Brezza();
			loop=false;
			break;
			
		case 5:
			Car=new Ertiga();
			loop=false;
			break;
			
		case 6:
			Car=new WagonR();
			loop=false;
			break;
			
		default:
			loop=false;
			break;
		}
		return Car;
			
		}
	}


