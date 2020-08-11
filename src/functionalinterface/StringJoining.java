package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * In this class String Joining
 * FlatMap
 * @author jemuthu
 *
 */
public class StringJoining {

	public static void main(String[] args) {

		System.out.println("String joining");
		List<String> courses =Arrays.asList("Spring Boot", "Hibernate", "Restful Webservices");
		
		//It will make a list of String to single String
		System.out.println(
				courses.stream().collect(Collectors.joining(",")));
		//Output : Spring Boot,Hibernate,Restful Webservices
		
		System.out.println("\n String Split");
		System.out.println("Spring".split(""));
		
		//Flat map Example
		System.out.println("\n Flat map Example");
		System.out.println(
				courses.stream().map(course -> course.split("")).flatMap(Arrays::stream)
				.collect(Collectors.toList()));
		//Note: FlatMap : each element of stream replaced with the content of mapped stream
		//Arrays::stream 
		//["S","p","r","i","n","g"] = > "S","p","r","i","n","g"
		//["A","W","S"] = "A","W","S"
		// Output: [S, p, r, i, n, g,  , B, o, o, t, H, i, b, e, r, n, a, t, e, R, e, s, t, f, u, l,  , W, e, b, s, e, r, v, i, c, e, s]

		//Flat map Example
		System.out.println("\n Distinct Character");
		System.out.println(
				courses.stream().map(course -> course.split("")).flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList()));
	}

}
