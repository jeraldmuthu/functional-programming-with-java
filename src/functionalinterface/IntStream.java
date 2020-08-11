package functionalinterface;

/**
 * In this class 
 * How to create Primitive dynamic Stream
 * 
 * IntStrea, DoubleStream, LongStream will help create a primitive streams dynamic way 
 * @author jemuthu
 *
 */
public class IntStream {

	public static void main(String[] args) {

		// It prints the value 1 to 9
		// System.out.println(
		// IntStream.range(1, 10).sum);

		// It prints the value 1 to 10
		// System.out.println(
		// IntStream.rangeClosed(1, 10).sum);

		// It prints the value 1 to 10 by increment of 2
		// System.out.println(
		// IntStream.itearte(1, e -> e + 2 ).peek(System.out :: println).sum);
		
		//return as a list
		// System.out.println(
				// IntStream.itearte(1, e -> e + 2 ).boxed().collect(Collectors.toList()));
		
		//map Long to BigInteger
				// System.out.println(
						// LongStream.itearte(1, e -> e + 2 ).maptoObj(BigInteger :: valueOf)
						// .reduce(BigInteger.ONE, BigInteger::multiply));
	}

}
