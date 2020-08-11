package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Reading file using Functional Programming
 * @author jemuthu
 *
 */
public class FPFiles {

	public static void main(String[] args) throws IOException {

		System.out.println("Reading file using FP");
		Files.lines(Paths.get("file.txt")).forEach(System.out::println);
		
		System.out.println("\n Reading file using FP");
		Files.lines(Paths.get("file.txt"))
		.map(str -> str.split(" "))
		.flatMap(Arrays :: stream)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("\n File directoryusing FP");
		/*
		 * System.out.println( Files.lines(Paths.get(".")) .filter(Files:: isDirectory)
		 * .forEach(System.out::println) );
		 */
		
		
	}

	
}
