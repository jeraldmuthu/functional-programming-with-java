package exception;

class ExceptionExample {

	public static void main(String[] args) {
		try{
			ageCal(args);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After catch");
	}

	private static void ageCal(String[] args) throws ArithmeticException {
			int age = Integer.parseInt(args[0]);
			if (age < 18)
					throw new ArithmeticException();
			else if (age >=60)
				throw new ArithmeticException("Employee is retired");
		
	}

}
