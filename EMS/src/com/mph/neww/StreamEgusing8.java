package com.mph.neww;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StreamEgusing8 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Car", "Bus", "Van", "", "Cycle", "", "Aeroplane", "", "Train");
		System.out.println("List of Vehicles :" + strList);

		long count = strList.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Count of Empty strings: " + count);

		long count1 = strList.stream().filter(s -> s.length() == 3).count();
		System.out.println("Count of str len 3: " + count1);

		List<String> filteredStr = strList.stream().filter(str -> !(str.isEmpty())).collect(Collectors.toList());
		System.out.println("Filtered Str :" + filteredStr);

		String mergeStr = strList.stream().filter(str -> !(str.isEmpty())).collect(Collectors.joining(","));
		System.out.println("Merged Str :" + mergeStr);//filter was validation purpose like predictive used in lambda

		List<Integer> intList = Arrays.asList(4, 5, 9, 5, 3, 7, 6, 1, 2, 3);
		System.out.println("List of Integers :" + intList);

		List<Integer> sqList = intList.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("sq list :" + sqList);//map to do or direct to do operations, distinct for remove duplicatesx

		IntSummaryStatistics stats = intList.stream().mapToInt(i -> i).summaryStatistics();//conversion of array to integer
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getCount());
		System.out.println(stats.getSum());
		System.out.println(stats.getAverage());

	}

}