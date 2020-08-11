package functionalinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import dto.Course;
/**
 * In this class for finding out 
 * SUM
 * AVG
 * COUNT
 * 
 * @author jemuthu
 *
 */
public class GetSumAvgCount {

	public static void main(String[] args) {

		List<Course> courses = Arrays.asList(new Course("Spring", "framework", 91, 20000),
				new Course("Spring Boot", "framework", 89, 21000),
				new Course("API", "Cloud", 75, 22000),
				new Course("Azure", "API", 73, 25000),
				new Course("FullStack", "FullStack", 93, 25000),
				new Course("MicroServices", "MicroServices", 92, 18000),
				new Course("Docker", "Cloud", 90, 22000));
		
		//Filter
		Predicate<Course> reviewScoreGreaterThan90 = course -> course.getReviewCourses() > 90;
		
		System.out.println("Sum of review Score GreaterThan 90");
		System.out.println();
		System.out.println(courses.stream().filter(reviewScoreGreaterThan90)
				.mapToInt(course -> course.getReviewCourses())
				.sum());
		
		System.out.println("Avg of review Score GreaterThan 90");
		System.out.println();
		System.out.println(courses.stream().filter(reviewScoreGreaterThan90)
				.mapToDouble(course -> course.getReviewCourses())
				.average());
		
		
		System.out.println("Count of category of course");
		System.out.println();
		System.out.println(courses.stream().filter(course -> course.getCategory().contains("framework"))
				.count());
		
		
	}

}
