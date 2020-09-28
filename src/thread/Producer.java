package thread;

public class Producer extends Thread {

	StringBuffer sb;
	
	
	public Producer() {
		sb = new StringBuffer();
	}

	@Override
	public void run() {
		synchronized (this.sb) {
			for (int i = 0; i <= 10; i++) {
				try {
					sb.append(i+":");
					System.out.println("Appending");
					Thread.sleep(1000);
				} catch (Exception e) {

				}
				sb.notify();
				System.out.println("Giving Notification to Consumber Sb");
			}
		}
	}

}
