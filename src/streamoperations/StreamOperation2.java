package streamoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import dto.Employee;

/**
 * 
 * Stream Operations : Sort by Comparator
 *
 */
public class StreamOperation2 {

	public static void main(String[] args) {
		List<String> lstnames = Arrays.asList("Layah", "Deepa", "Jerald");
		System.out.println("Sort Names By NaturalOrder :");
		sortNamesByNaturalOrder(lstnames);
		System.out.println("Sort Names By NaturalOrder :");
		sortNamesByReverseOrder(lstnames);
		
		List<Employee> lsiOfEmployee = populateListOfEmployee();
		System.out.println("Sort name by name length");
		sortNamesByLength(lstnames);
	}

	private static void sortNamesByNaturalOrder(List<String> lstnames) {
		lstnames.stream().sorted(Comparator.naturalOrder()).forEach(System.out :: println);
		System.out.println("");
	}

	
	private static void sortNamesByReverseOrder(List<String> lstnames) {
		lstnames.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);
		System.out.println("");
	}
	
	private static void sortNamesByLength(List<String> names) {
		names.stream().sorted(Comparator.comparing(name -> name.length())).forEach(System.out :: println);
	}
	
	private static List<Employee> populateListOfEmployee() {
		
		List<Employee> lstOfEmployee = new ArrayList<Employee>();
		
		Employee jerald = new Employee();
		jerald.setName("Jerald M");
		jerald.setAge(34);
		
		Employee deepa = new Employee();
		deepa.setName("Deepa R");
		deepa.setAge(27);
		
		Employee layah = new Employee();
		layah.setName("Layah J");
		layah.setAge(1);
		
		lstOfEmployee.add(jerald);
		lstOfEmployee.add(deepa);
		lstOfEmployee.add(layah);
		
		return lstOfEmployee;
		
	}
}
