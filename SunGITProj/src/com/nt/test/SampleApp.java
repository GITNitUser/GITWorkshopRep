package com.nt.test;

public class SampleApp {

	public static void main(String[] args) {
	    System.out.println("hello");
	    for(int i=1;i<=10;++i){
	    	System.out.println(i);
	    }
	  /*  System.out.println("add==="+new Math().sum(100,200));*/
	    WishGenerator generator=new WishGenerator();
	    System.out.println("Msg:::"+generator.generateWishMessage("Raja"));
	    //invoke method
	    new ListCountries().displayCountries();
	}//main
}//class
