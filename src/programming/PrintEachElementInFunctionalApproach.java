package programming;

import java.util.Arrays;
import java.util.List;

public class PrintEachElementInFunctionalApproach {

	public static void main(String[] args) {

		List<Integer> lsitofNumbers = Arrays.asList(12,9,6,7,8,9,2,3,14,15);
		List<String> lsitofCourses = Arrays.asList("Spring", "Spring Boot", "MicroServices", "AWS", "PCF", "Docker", "Azure", "Kubernetes");
		printAllNumbersInListFunctional(lsitofNumbers);
		printEvenNumbersInListFunctional(lsitofNumbers);
		
		//Exercises ::: 
		printOddNumbersInListFunctional(lsitofNumbers);
		printStringInListFunctional(lsitofCourses);
		printCoursesContainsSpringInListFunctional(lsitofCourses);
		printCourseNameAtLeastHasFourCharactersInListFunctional(lsitofCourses);
		
		//Map 
		printSquareOfOddNumbersInListFunctional(lsitofNumbers);
		
		//Exercises ::: using Map
		printCubeEvenNumbersInListFunctional(lsitofNumbers);
		printOfEachNumberOFCharacterInCoursesInListFunctional(lsitofCourses);
		
	}

	private static void printAllNumbersInListFunctional(List<Integer> asList) {
		System.out.println("printAllNumbersInListFunctional :");
		asList.stream().forEach(System.out :: println);
		System.out.println("-----------------------");
	}

	private static void printEvenNumbersInListFunctional(List<Integer> asList) {
		System.out.println("printEvenNumbersInListFunctional : ");
		asList.stream().filter(n -> n%2 == 0).forEach(System.out :: println);
		System.out.println("-----------------------");
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> asList) {
		System.out.println("printOddNumbersInListFunctional :");
		asList.stream().filter(n -> n%2 != 0).forEach(System.out :: println);
		System.out.println("-----------------------");
	}

	
	private static void printStringInListFunctional(List<String> listOfCourses) {
		System.out.println("printStringInListFunctional : ");
		listOfCourses.stream().forEach(System.out :: println);
		System.out.println("-----------------------");
	}
	
	private static void printCoursesContainsSpringInListFunctional(List<String> listOfCourses) {
		System.out.println("printCoursesContainsSpringInListFunctional : ");
		listOfCourses.stream().filter(s -> s.contains("Spring")).forEach(System.out :: println);
		System.out.println("-----------------------");
	}

	private static void printCourseNameAtLeastHasFourCharactersInListFunctional(List<String> listOfCourses) {
		System.out.println("printCourseNameAtLeastHasFourCharactersInListFunctional : ");
		listOfCourses.stream().filter(s -> s.length() >= 4).forEach(System.out :: println);
		System.out.println("-----------------------");
	}
	
	private static void printSquareOfOddNumbersInListFunctional(List<Integer> asList) {
		System.out.println("printSquareOfNumbersInListFunctional :");
		asList.stream().filter(n -> n%2 != 0).
		map(number -> number * number)
		.forEach(System.out :: println);
		System.out.println("-----------------------");
	}
	
	
	private static void printCubeEvenNumbersInListFunctional(List<Integer> asList) {
		System.out.println("printCubeEvenNumbersInListFunctional : ");
		asList.stream().filter(n -> n%2 == 0)
		.map(number -> number * number * number)
		.forEach(System.out :: println);
		System.out.println("-----------------------");
	}
	
	private static void printOfEachNumberOFCharacterInCoursesInListFunctional(List<String> listOfCourses) {
		System.out.println("printOfEachNumberOFCharacterInCoursesInListFunctional : ");
		listOfCourses.stream().map(s -> s.length()).forEach(System.out :: println);
		System.out.println("-----------------------");
	}
}
