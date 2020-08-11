package functionalinterface;

import java.util.Arrays;
import java.util.List;

/**
 * Functional Programming Intermediate operation are Lazy
 * @author jemuthu
 *
 */
public class FunctionalprogrammingForPerformance {

	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "MicroServices", "Spring Cloud");
		
		System.out.println(
				courses.stream().filter(course -> course.length() > 11)
				.map(String :: toUpperCase)

				);
		

	}

}
