package com.oops.demo;

public class Authormain {

	public static void main(String[] args) {
		Author a1=new Author("Naveen","Kumar");
		Author a2=new Author("Ashwin","Kumar");
		
		System.out.println(a1.getFirstName());
		System.out.println(a1.getLastName());
		
		System.out.println(a2);
		
		
		
		
		Author a3=new Author();
		
		Author a4;
		//System.out.println(a4);
		
		a4=a2;
		System.out.println(a4);
		
		

	}

}
