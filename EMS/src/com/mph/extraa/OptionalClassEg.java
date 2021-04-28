package com.mph.extraa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.w3c.dom.DOMStringList;

public class OptionalClassEg {

	public static String getStringValue(List<String> list)
	{
		Optional<String> opstr = list.stream().filter(str->str.startsWith("W")).findFirst();
		return opstr.isPresent() ? opstr.get() :"NO STRINGS AVAILABLE.";
	}
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Rat","Cat","","Tiger","Lion","Cheeta");
		System.out.println(strList);
		
		System.out.println(getStringValue(strList));
	}

}
