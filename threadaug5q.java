class newThread implements Runnable{
	@Override
	public void run() {
		try {
			for(int i=1;i<=20;i++){
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
public class threadaug5q {
	public static void main(String[] args) {
		newThread t1 = new newThread();
		Thread must = new Thread(t1);
		must.start();

	}

}
