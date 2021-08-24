package question2;
import java.util.Scanner;

public class vowelorconsonent
{
	public static void main(String[ ] arg)
	{
	System.out.println("enter a value :");
	char ch;
	Scanner sc=new Scanner(System.in);
    ch=sc.next( ).charAt(0);	
    int value =(int)ch;
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character is  Vowel"); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	{
		System.out.println("Entered character  is Consonant");
	}
	      else
	      {
		System.out.println("Not an alphabet");		
	}
	}
}

