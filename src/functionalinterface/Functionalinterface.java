package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * behind what is happening in Consumer, Function, Predicate , reduce
 *
 */
public class Functionalinterface {

	/**
	 * This is what happening behind the functional interface.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("findOddNumbers");
		findOddNumbers(lst);
		System.out.println(" ");
		System.out.println("findSumofInteger");
		findSumofInteger(lst);
		System.out.println("");

	}

	private static void findOddNumbers(List<Integer> lst) {

		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 2 != 0;
			}
		};

		Function<Integer, Integer> function = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {

				return t * t;
			}

		};

		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}
		};

		lst.stream().filter(predicate) // in behind the predicate interface calling the test abstract class
				.map(function) // in behind the function interface calling the test abstract class
				.forEach(consumer); // in behind the consumer interface calling the test abstract class

	}

	private static void findSumofInteger(List<Integer> lst) {

		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {

				return t + u;
			}
		};

		int sum = lst.stream().reduce(0, binaryOperator);
		System.out.println("Sum of integer " + sum);
	}

}
