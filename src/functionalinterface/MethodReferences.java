package functionalinterface;

import java.util.Arrays;
import java.util.List;

/**
 * We can use the Method reference in lambda Expression for example :
 * 
 * String :: toUpperCase
 * 
 *
 *
 */
public class MethodReferences {
	
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Jerald", "Deepa", "Layah");
		lst.stream()
		.map(String::toUpperCase) //We can use for normal method
		.forEach(MethodReferences::print); //We can use for static method
	}

	public static void print(String str) {
		System.out.println(str);
	}
}
