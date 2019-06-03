package guvi;
import java.util.*;
public class Even_odd {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number you want to check:");
		int a;
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}
		else if (a%2==1) {
			System.out.println("Odd");
		}
		else {
			System.out.println("invalid");
		}
	}
}
