package week1day2;
import java.util.*;

public class PostiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");

		int a = sc.nextInt();

		if (a<0) {


			System.out.println("The entered number is a negative number");

		}

		else if (a>0) {

			System.out.println("The entered number is a positive number");
		}

		else {

			System.out.println("The number you have entered is " + a);

		}

	}

}
