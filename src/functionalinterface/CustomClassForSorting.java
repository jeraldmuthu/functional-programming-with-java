package functionalinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import dto.Course;
/**
 * In this class I have sort the Course Object by custom Comparator.
 * @author jemuthu
 *
 */
public class CustomClassForSorting {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "framework", 91, 20000),
											 new Course("Spring Boot", "framework", 89, 21000),
											 new Course("API", "Cloud", 75, 22000),
											 new Course("Azure", "API", 73, 25000),
											 new Course("FullStack", "FullStack", 93, 25000),
											 new Course("MicroServices", "MicroServices", 92, 18000),
											 new Course("Docker", "Cloud", 90, 22000));
		
		System.out.println("Sorting for object using Comaprator ");
		Comparator<Course> comapratorByNoOfStudents = Comparator.comparing(Course::getNoOfstudents).reversed();
		System.out.println("Sorting by no of students ");
		System.out.println(courses.stream().sorted(comapratorByNoOfStudents).collect(Collectors.toList()));
		
		Comparator<Course> comapratorByNoofreviewAndNoOfStudents = Comparator.comparing(Course::getNoOfstudents)
				.thenComparing(Course::getReviewCourses);
		System.out.println("Sorting by no of students and Review ");
		System.out.println(courses.stream().sorted(comapratorByNoofreviewAndNoOfStudents).collect(Collectors.toList()));
	}

}
