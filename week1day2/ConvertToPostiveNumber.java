package week1day2;
import java.util.*;


public class ConvertToPostiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		
		int a = sc.nextInt();
		
		if (a<0) {
			
			int postiveNumber = a * -1;
			System.out.println("The negative number you have entered is converted to positive number " + postiveNumber);
		}
		
		else if (a>0) {
			
			System.out.println("The entered number is a postive number");
			
		}
		
		else {
			
			System.out.println("The entered number is " + a);
			
		}

	}

}
