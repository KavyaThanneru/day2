package question3;
import java.util.Scanner;

public class marks {
	public static void main(String[] args) {
		System.out.println("enter your marks");
		int a,b,c,d,e,f,s,n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if ((n==100))
		{
			System.out.println("your grade is s");
		}
		else if((n<=100)&&(n>90)){
			System.out.println("your grade is a");
		}
		else if((n<=90)&&(n>80)) {
			System.out.println("your grade is b");
		}
		else if((n<=80)&&(n>70)) {
			System.out.println("your grade is c");
		}
		else if((n<=70)&&(n>60)) {
			System.out.println("your grade is d");
		}
		else if((n<=60)&&(n>50)) {
			System.out.println("your grade is e");
		}
		else if((n<50)) {
			System.out.println("fail");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	   
         
		
	}
	

}
