package com.mph.neww;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamEg {

	public static void main(String[] args) {
		int[] intList = {4, 5, 9, 5, 3, 7, 6, 1, 2, 3};
		System.out.println("Array of Integers :" + Arrays.toString(intList));
		
		//IntStream.of(intList).forEach(System.out::println);

		System.out.println("Total Count " + IntStream.of(intList).count());
		System.out.println("Total Count " + IntStream.of(intList).max().getAsInt());
		System.out.println("Total Count " + IntStream.of(intList).min().getAsInt());
		System.out.println("Total Count " + IntStream.of(intList).sum());
		System.out.println("Total Count " + IntStream.of(intList).average().getAsDouble());
		
		IntStream.of(intList).filter(val->val%2==0).sorted().forEach(System.out::println);
		
		System.out.println("Range ----- " + IntStream.range(1, 5).sum());  //1+2+3+4 
		System.out.println("Range ----- " + IntStream.rangeClosed(1, 1000
				).sum());  //1+2+3+4+5 includes 1000 also
		
		
		int[] va = {1,2,3,4,5};
		System.out.println("Reduce --" + IntStream.of(va).reduce(1, (x,y)->(x+y)));
		//0+1 =1+2=3+3		
	}
	



}
