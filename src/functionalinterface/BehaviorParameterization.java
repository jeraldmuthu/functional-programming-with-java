package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/**
 * In this class we are passing the method behavior as parameter.
 * it is called as BehaviorParameterization. 
 * @author jemuthu
 *
 */
public class BehaviorParameterization {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Even Numbers");
		findEvenOrOddNumbers(lst, x -> x%2 ==0);
		System.out.println("");
		System.out.println("Odd Numbers");
		findEvenOrOddNumbers(lst, x -> x%2 !=0);
	}

	private static void findEvenOrOddNumbers(List<Integer> lst, Predicate<Integer> predicate) {
		lst.stream().filter(predicate).forEach(System.out::println);
	}
	
	

}
