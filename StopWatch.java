import java.util.Scanner;
class watch extends Thread {
int a=0,b=0;


	public void run (){
	try {

		for (int i=0;i<100;i++){
			if (b >=59){
				b=0;
				a+=1;
				Thread.sleep(1000);
				System.out.println(a+" "+b);
			   
			}
			else{
				Thread.sleep(1000);
				b+=1;
				System.out.println(a+" "+b);


			}
		}
	}
	catch (InterruptedException ie){
		System.out.println(ie);
	}

}
}
class stop extends Thread{

	public  void run(){
			try {
				char a= 'v';
				for (int i=0;i<2;i++){
					if (a=='y'){
							System.exit(0);

					}
					else {
						while (a != 'y') {
							Thread.sleep(10);
							a = new Scanner(System.in).next().charAt(0);
						}
					}
				}
			}
			catch (InterruptedException ie){
				System.out.println(ie);
			}
	 }

}


public class StopWatch {
	public static void main(String[] args) {
		watch t1=new watch();
		stop t2 = new stop();
		t1.start();
		t2.start();


	}
}
