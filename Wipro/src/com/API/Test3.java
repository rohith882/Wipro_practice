package com.API;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Test3 {
	public static void main(String[]args) {
		List<String>al = Arrays.asList("Rohith","Pavan","harsih","Purush","Ramu", "jyothi");
		List<String>filteredNames = al.stream().filter(x->x.startsWith("P")).collect(Collectors.toList());
		//System.out.println(filteredNames);
		
		List<String>upperCaseNames = al.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		//System.out.println(upperCaseNames);
		
		List<String>sortedNames = al.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		
		List<String>sortedNamesDescending = al.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
		//System.out.println(sortedNamesDescending);
		
		//al.stream().sorted((x,y)->y.compareTo(x)).forEach(x->System.out.println(x));
		
		List<Integer>numbers = Arrays.asList(12,16,19,34,56,645);
		Optional<Integer> min = numbers.stream().min((x,y) -> x.compareTo(y));
		//min.ifPresent(value -> System.out.println("the minimum values is: " + value));
		
		//numbers.stream().max(Comparator.naturalOrder()).ifPresent(x->System.out.println("the maximum value is  :  " + x));
		
		
		Map<String,Integer> ageMap = new LinkedHashMap<>();
		ageMap.put("Ramesh", 12);
		ageMap.put("Mahesh", 24);
		ageMap.put("Venkat", 46);
		ageMap.put("Suresh", 94);
		List<Integer>doubleValues = ageMap.values().stream().map(x-> x*2).collect(Collectors.toList());
		System.out.println(doubleValues);
		
		 
	
	}}
