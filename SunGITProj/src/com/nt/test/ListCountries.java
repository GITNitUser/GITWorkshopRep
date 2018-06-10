package com.nt.test;

import java.util.Locale;

public class ListCountries {
	
	public void  displayCountries(){
		Locale locales[]=Locale.getAvailableLocales();
		for(Locale l:locales){
			System.out.println(l.getDisplayCountry()+"  "+l.getDisplayLanguage());
		}
		//hello111678
		//abc1234
	}
	public  String print(){
		 return  "welcome";
	}

}
