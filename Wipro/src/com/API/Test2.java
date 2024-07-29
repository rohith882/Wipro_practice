package com.API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[]args) {
		List<String>names = Arrays.asList("Rohith", "Aravind", "Akash","Ravi","amkar");
		List<String>filteredNames = names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println(filteredNames);
	}

}
