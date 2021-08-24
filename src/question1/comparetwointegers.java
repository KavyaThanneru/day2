package question1;
import java.util.Scanner;

public class comparetwointegers {
	
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	if(a>b&&a>c)
	{
	System.out.println("a is greater");
	}
	if(b>c&&b>a)
	{
	System.out.println("b is greater");
	}
	if(c>a&&c>b)
	{
	System.out.println("c is greater");
	}
	}

}
