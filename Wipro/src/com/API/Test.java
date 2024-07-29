package com.API;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[]args) {
		List<String>names = Arrays.asList("Rohith", "Ganesh", "Akash","ahannu","amkar");
		List<String>filteredNames = new ArrayList<>();
		for(String name: names) {
			if(name.startsWith("G"));{
				filteredNames.add(name);
			}
			
		}
		for(String fn:filteredNames)
	
		{
			System.out.println(fn);
		}
	}

}

