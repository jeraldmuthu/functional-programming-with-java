package functionalinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import dto.Course;

/**
 * In this class we are going to get the single result
 * Operations:
 * Min;
 * Max;
 * FindAny
 * FindFirst
 * @author jemuthu
 *
 */
public class GetMaxMinFindFirstFinadAny {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "framework", 91, 20000),
				new Course("Spring Boot", "framework", 89, 21000), new Course("API", "Cloud", 75, 22000),
				new Course("Azure", "API", 73, 25000), new Course("FullStack", "FullStack", 93, 25000),
				new Course("MicroServices", "MicroServices", 92, 18000), new Course("Docker", "Cloud", 90, 22000));
		
		//Sorting
		Comparator<Course> comapratorByNoOfReviews = Comparator.comparing(Course::getReviewCourses);
		
		System.out.println("FindFirst :: to get only the first Element");
		System.out.println(
		courses.stream().sorted(comapratorByNoOfReviews).findFirst());
		
		System.out.println("FindAny :: to get Any of the element from the List");
		System.out.println(
		courses.stream().sorted(Comparator.comparing(course -> course.getNoOfstudents() > 90) ).findAny());
		
		
		System.out.println("Max :: to get Maximum element from the List");
		System.out.println(
		courses.stream().max(Comparator.comparing(Course::getReviewCourses)));
		
		System.out.println("Min :: to get Minimum element from the List");
		System.out.println(
		courses.stream().min(Comparator.comparing(Course::getReviewCourses)));
		
		//Note : Optional return type is used to return the default return type. 
		//Optional it will return the Optional.empty
	}

}
