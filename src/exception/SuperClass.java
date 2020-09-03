package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class SuperClass {

	void m1() throws FileNotFoundException {
		FileInputStream fio = new FileInputStream("s.txt");
	}

	
}


class SubClass extends SuperClass {
	void m1() throws FileNotFoundException  {
		FileInputStream fio = new FileInputStream("s.txt");
	}
}