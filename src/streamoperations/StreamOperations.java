package streamoperations;

import java.util.Arrays;
import java.util.List;

/**
 * Stream Operations:  reduce, map, filter, distinct, sorted
 * @author jemuthu
 *
 */

public class StreamOperations {

	public static void main(String[] args) {
	
		List<Integer> lstOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		findSumOfInteger(lstOfInteger);
		//Exercises
		/** Square every number in a list and find the sum of squares **/
		findSumOfSquares(lstOfInteger);
		
		/** Cube every number in a list and find the sum of cubes **/
		findSumOfCube(lstOfInteger);
		
		/** Sum of odd numbers in a list**/
		findSumOfOddNumbersInList(lstOfInteger);
		
		List<Integer> lstOfduplicateInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);
		
		/** Find the distinct Odd numbers **/
		findDistinctOddNumberInList(lstOfduplicateInteger);
		
		/** Find the Sort numbers in List **/
		List<Integer> lstnotSorted = Arrays.asList(9,8,7,6,4,5);
		sortNumbersInList(lstnotSorted);
	}

	private static void findSumOfInteger(List<Integer> lstOfInteger) {
		System.out.println("findSumOfInteger");
		int sum =  lstOfInteger.stream().reduce(0, Integer :: sum);
		System.out.println("Sum of Integer " + sum);
		System.out.println(" ");
	}
	
	private static void findSumOfSquares(List<Integer> lstOfInteger) {
		System.out.println("findSumOfInteger");
		int SumOfSquares =  lstOfInteger.stream().map(number -> number * number).reduce(0, Integer :: sum);
		System.out.println("Sum of Squares :: " + SumOfSquares);
		System.out.println(" ");
	}

	private static void findSumOfCube(List<Integer> lstOfInteger) {
		System.out.println("findSumOfCube");
		int SumOfSquares =  lstOfInteger.stream().map(number -> number * number * number).reduce(0, Integer :: sum);
		System.out.println("Sum of Cube :: " + SumOfSquares);
		System.out.println(" ");
	}
	
	private static void findSumOfOddNumbersInList(List<Integer> lstOfInteger) {
		System.out.println("findSumOfOddNumbersInList");
		int SumOfSquares =  lstOfInteger.stream().filter(n -> n%2 !=0).reduce(0, Integer :: sum);
		System.out.println("Sum of Odd numbers in List :: " + SumOfSquares);
		System.out.println(" ");
	}
	
	public static void findDistinctOddNumberInList(List<Integer> lstOfInteger) {
		System.out.println("findDistinctOddNumberInList");
		lstOfInteger.stream().distinct().filter(n -> n%2 ==0).forEach(System.out :: println);
		System.out.println(" ");
	}
	
	public static void sortNumbersInList(List<Integer> lstOfInteger) {
		System.out.println("sortNumbersInList");
		lstOfInteger.stream().sorted().forEach(System.out :: println);
		System.out.println(" ");
	}
}
