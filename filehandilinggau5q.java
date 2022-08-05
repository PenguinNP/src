import java.io.*;
import java.util.Scanner;

public class filehandilinggau5q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f = new File("test.txt");
		try {
		//String a= sc.nextLine();
		//FileWriter fw=new FileWriter(f);
		//fw.write(a);
		FileReader fr = new FileReader(f);
		int c;
			while((c= fr.read())!=-1){
			System.out.print((char)c);}
		fr.close();
		}
		catch(Exception e){
		System.out.println(e);
		}
	}
}
