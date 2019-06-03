package guvi;
import java.util.*;
public class Positive_negative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a;
		a=sc.nextInt();
		if(a>0) {
			System.out.println("Positive");
		}
		else if(a==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
	}

}
