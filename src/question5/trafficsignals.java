package question5;
import java.util.Scanner;

public class trafficsignals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float s = sc.nextFloat();
		Float d = sc.nextFloat();
		Float t = sc.nextFloat();
		if((s<t)||((s>t)&&(d>1)))
			System.out.println("no");
		else
			System.out.println("yes");

	}

}
