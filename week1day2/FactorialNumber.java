package week1day2;


public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int input = 5;
		 int fact = 1;
         for(int i = 1; i <= input; i++)
         {
        	 fact *= i;
         }
         
         System.out.println("The factorial of " + input + " is " + fact);

}

}
