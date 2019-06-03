package guvi;
import java.util.*;
public class Vowel_consonant {
	public static void main(String [] args) {
	Scanner a=new Scanner (System.in);
	System.out.println("Enter the character you want to check");
			char ch;
			ch=a.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'  || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("Vowels");
		}
		else if ((ch>='a' && ch<='z') || (ch>='A' && ch>='Z')) {
			System.out.println("Consonant");
		}	
		else {
			System.out.println("Invalid");
		}
	}
}
