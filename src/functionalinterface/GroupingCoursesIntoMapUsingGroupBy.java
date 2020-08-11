package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import dto.Course;

public class GroupingCoursesIntoMapUsingGroupBy {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("Spring", "framework", 91, 20000),
											new Course("Spring Boot", "framework", 89, 21000),
											new Course("API", "Cloud", 75, 22000),
											new Course("Azure", "API", 73, 25000),
											new Course("FullStack", "FullStack", 93, 25000),
											new Course("MicroServices", "MicroServices", 92, 18000),
											new Course("Docker", "Cloud", 90, 22000));

		System.out.println(" :: Grouping Courses Into Map Using GroupBy Category :: \n ");
		System.out.println(
		courses.stream().collect(Collectors.groupingBy(Course :: getCategory)) + "\n");
		
		System.out.println(" :: Grouping Courses Into Map Using GroupBy Category with count :: \n ");
		System.out.println(
		courses.stream().collect(Collectors.groupingBy(Course :: getCategory, Collectors.counting())));
		
		System.out.println(" :: Grouping Courses Into Map Using GroupBy Category with List of only by Courses :: \n ");
		System.out.println(
		courses.stream().collect(Collectors.groupingBy(Course :: getCategory,
				Collectors.mapping(Course::getName, Collectors.toList()))));
	}

}
