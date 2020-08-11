package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Functional Interface :
 * Supplier,
 * UnaryOperatory,
 * BiPredicate,
 * BiFunction, 
 * BiConsumer
 * @author jemuthu
 *
 */
public class FuntionalInterface2 {

	public static void main(String[] args) {
		//Supplier Interface wont accept any input it only return output. Eg : Factory pattern
		System.out.println("Supplier interface");
		Supplier<Integer> supplier = () ->2;
		System.out.println(supplier.get());
		
		System.out.println("UnaryOperator interface");
		//UnaryOperatory takes single input and return the output
		UnaryOperator<Integer> unaryOperatory = x -> x * 10;
		System.out.println(unaryOperatory.apply(3));
		
		System.out.println("BiPredicate interface");
		//BiPrdicate will accept tow argument
		BiPredicate<Integer, String> biPredicate = (num, str) -> {
			return num < 10 && str.length() > 4;
		};
		System.out.println(biPredicate.test(5, "Layahis Queen"));
		
		System.out.println("BiFuntion interface");
		//BiFuntion will accept three parameter (First parameter Input Type, Second parameter input Type,
		// 										thrid parameter output type)
		BiFunction<Integer, String, String> biFunction = (num, str) -> {
			return num + " " + str;
		};
		System.out.println(biFunction.apply(29, "Layahis Queen"));
		
		System.out.println("BiConsumer interface");
		//BiConsumer will accept two parameter (two input Type)
		BiConsumer<Integer, String> consumer = (i , str) -> {
			System.out.println(i);
			System.out.println(str);
		};
		
		consumer.accept(1, "Layah Jerald");
	}

}
