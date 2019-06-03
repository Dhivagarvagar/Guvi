package guvi;
import java.util.*;
public class Alphabet_or_not {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input to check");
		char a=sc.next().charAt(0);
		if((a>=65 && a<=90) || (a>=97 && a<=122)) 
		{
			System.out.println("The given value is an Alphabet");
		}
		else {
			System.out.println("No");
		     }
		}
}
