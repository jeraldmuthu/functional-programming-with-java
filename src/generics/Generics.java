package generics;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Generics {

	public void m1 (long l1) {
		System.out.println("primitive");
	}
	
	public void m1(Long l1) {
		System.out.println("Object");
	}
	
	public static void main(String[] args) {

		Generics g = new Generics();
		long x =20;
		
		Long y= 30L;
		g.m1(x);
		
		g.m1(y);
	}

}
