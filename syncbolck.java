class table {
	void printtable(int n , String threadName){
		synchronized (this){
			for (int i =1;i<=5;i++){
				System.out.println(n*i);
				try{
					Thread.sleep(1000);
				}
				catch (Exception e){
					System.out.println(e);
				}
			}
		}
		for (int i=1;i<=5;i++){
			try {
				System.out.println("Hello From"+threadName);
			}
			catch (Exception r){
				System.out.println(r);
			}
		}
	}
}
class mythread1 extends Thread{
	table t;

	public mythread1(table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printtable(5,"MyThread1");
	}
}
class mythread2 extends Thread{
	table t;

	public mythread2(table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printtable(3,"MyThread2");
	}
}
public class syncbolck {
	public static void main(String[] args) {
		table tb = new table();
		mythread1 t1 = new mythread1(tb);
		mythread2 t2 = new mythread2(tb);
		t1.start();
		t2.start();
	}
}
