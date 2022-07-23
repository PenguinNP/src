class  Thproirity implements Runnable{
	@Override
	public void run() {
		System.out.println("Running Thread Name :"+ Thread.currentThread().getName());
		System.out.println("Running Thread Priority :"+ Thread.currentThread().getPriority());
	}
}
public class Threadprio {
	public static void main(String[] args) {
		Thread m1 = new Thread(new Thproirity(),"Thread1");
		Thread m2 = new Thread(new Thproirity(),"Thread2");
		m1.setPriority(10);
		m2.setPriority(Thread.MIN_PRIORITY);
		m1.start();
		m2.start();
	}
}
