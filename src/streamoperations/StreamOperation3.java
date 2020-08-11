package streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Stream Operation : Collect toList(), toSet()
 * 
 * @author jemuthu
 *
 */
public class StreamOperation3 {

	public static void main(String[] args) {

		List<Integer> integ = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 3, 2, 3);

		// Collect the odd number in list
		List<Integer> returnValue = collectOddNumberList(integ);
		System.out.println("return value " + returnValue.toString());

		// Collect the Even number in list
		Set<Integer> returnevenValue = collectEvenNumberList(integ);
		System.out.println("return value " + returnevenValue.toString());
	}

	private static List<Integer> collectOddNumberList(List<Integer> integ) {
		return integ.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
	}

	private static Set<Integer> collectEvenNumberList(List<Integer> integ) {
		return (Set<Integer>) integ.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
	}

}
