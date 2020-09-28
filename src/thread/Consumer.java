package thread;


class Consumer extends Thread {

	Producer prod;

	public Consumer(Producer prod) {
		this.prod = prod;
	}
	
	public void run() {
		synchronized (prod) {
		System.out.println(prod.sb);
		try {
			System.out.println("Waiting for producer object");
			prod.wait();
		} catch(Exception e) {
			System.out.println("Excetion in Consumer");
		}
		}
	}
	
}
