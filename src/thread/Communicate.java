package thread;

public class Communicate {

	public static void main(String[] args) {
		Producer prod = new Producer();
		Consumer con = new Consumer(prod);
		
		prod.start();
		con.start();
	}

}
