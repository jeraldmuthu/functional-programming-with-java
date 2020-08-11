package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import dto.Course;

/**
 * This is the class for evaluating AnyMatch, nonMatch, AllMatch
 * @author jemuthu
 *
 */

public class CustomClassForANYMatchNonMatchAllMatch {

	public static void main(String[] args) {
		
		  List<Course> courses = Arrays.asList(new Course("Spring", "framework", 91,20000),
				  								new Course("Spring Boot", "framework", 89, 21000),
				  								new Course("API", "Cloud", 75, 22000),
				  								new Course("Azure", "API", 73, 25000),
				  								new Course("FullStack", "FullStack", 93, 25000),
				  								new Course("MicroServices", "MicroServices", 92, 18000),
				  								new Course("Docker", "Cloud", 90, 22000));
		  
		  System.out.println(" ######### Any Match ####### ");
		  Predicate<Course> anyMatch = course -> course.getReviewCourses() > 90;
		  
		  System.out.println(courses.stream().anyMatch(anyMatch));
		  
		  System.out.println(" ######### Non Match ####### ");
		  Predicate<Course> nonMatch = course -> course.getNoOfstudents() < 20000;
		  
		  System.out.println(courses.stream().noneMatch(nonMatch));
		 
		  System.out.println(" ######### All Match ####### ");
		  Predicate<Course> allMatch = course -> course.getReviewCourses() > 80;
		  
		  System.out.println(courses.stream().allMatch(allMatch));
	}

}
