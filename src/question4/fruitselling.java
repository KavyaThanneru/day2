package question4;
import java.util.Scanner;

public class fruitselling {

	public static void main(String[] args) {
		System.out.println("enter price of dozen mangoes");
		System.out.println("enter the cost prize");
		System.out.println("enter the selling price");
		float a,b,c;
		Scanner sc =new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		if(b-c>0)
		{
			System.out.println("loss rs: "+(b-c));
		}
		else if(b-c<0)
		{
			System.out.println("profit rs: "+(c-b));
		}
		else
		{
			System.out.println("no profit no loss");
		}
		
		

	}

}
