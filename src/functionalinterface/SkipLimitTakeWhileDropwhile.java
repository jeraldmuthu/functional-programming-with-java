package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import dto.Course;

/**
 * In this Course i am going to use Skip() ; Limit(); takeWhile(); dropWhile();
 * 
 * Skip() - Returns a stream consisting of the remaining elements of this stream
 * 
 * Limit() - Returns a stream consisting of the elements of this stream,
 * truncated to be no longer than {@code maxSize} in length.
 * 
 * In Java 9
 * 
 * takeWhile() - 
 * 
 * dropWhile() -
 * 
 * @author jemuthu
 *
 */
public class SkipLimitTakeWhileDropwhile {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "framework", 91, 20000),
				new Course("Spring Boot", "framework", 89, 21000), new Course("API", "Cloud", 75, 22000),
				new Course("Azure", "API", 73, 25000), new Course("FullStack", "FullStack", 93, 25000),
				new Course("MicroServices", "MicroServices", 92, 18000), new Course("Docker", "Cloud", 90, 22000));

		System.out.println(courses);

		System.out.println("Skip intermediate function");

		System.out.println(courses.stream().skip(5).collect(Collectors.toList()));
		System.out.println(" ");
		System.out.println("Limit intermediate function");

		System.out.println(courses.stream().limit(1).collect(Collectors.toList()));
		System.out.println(" ");
		
	}

}
