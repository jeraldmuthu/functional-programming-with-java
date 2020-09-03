package datastructure.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GraphExample {

	public static void main(String[] args) {

		
		HashMap<String, List<String>> map = new HashMap<>();
		
		map.put("1" , new LinkedList<String>());
		
		map.put("2" , new LinkedList<String>());
		
		map.get("1").add("2");
		map.get("1").add("3");
		
		System.out.println(map.toString());
		
		System.out.println(map.keySet());
		
		System.out.println("The graph has "
                + map.get("2").size() 
                + " vertex"); 
		
	}

}
