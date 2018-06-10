package com.nt.test;

import java.util.Locale;

public class ListCountries {
	
	public void  displayCountries(){
		Locale locales[]=Locale.getAvailableLocales();
		for(Locale l:locales){
			System.out.println(l.getDisplayCountry());
		}
	}

}
