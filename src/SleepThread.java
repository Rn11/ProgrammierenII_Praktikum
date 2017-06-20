class SleepThread extends Thread {
	private Thread t;
	private String threadName;

	SleepThread(String name) {
		threadName = name;
	}

	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("hat gewartet");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
