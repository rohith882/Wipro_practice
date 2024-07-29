package com.API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	public static List<Employee> getAll() {

		return Stream.of(

				new Employee(101, "john", "john@gmail.com", Arrays.asList("987679", "876567")),
				new Employee(102, "doe", "doe@gmail.com", Arrays.asList("675678", "123456")),
				new Employee(103, "smith", "smith@gmail.com", Arrays.asList("123456", "678901"))).collect(Collectors.toList());

	}
}

