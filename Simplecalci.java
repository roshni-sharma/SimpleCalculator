import java.util.Scanner;
public class Simplecalci {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	// Taking Input from the user
	System.out.println("Enter the First Number");
	Double n1=sc.nextDouble();
	System.out.println("Enter the Second Number");
	Double n2=sc.nextDouble();
	
	// User choice for arithmetic operation
	System.out.println(" Please Select the operator : +,-,*, or /");
	char operator=sc.next().charAt(0);
	
	// Various cases for particular user choice 
	switch(operator) {
		case '+':
			System.out.println("Addition of numbers is "+(n1+n2));
			break;
		case '-':
			System.out.println("Subtraction of numbers is "+(n1-n2));
			break;
	
		case '*':
			System.out.println("Multiplication of numbers is "+(n1*n2));
			break;
		case '/':
			
			if(n2==0) { 
				System.out.println("Please Enter Valid Denominator Value");
				break;
			}
			else {
			System.out.println("Division of numbers is "+(n1/n2));
			break;
			}
	}
	sc.close();
	System.out.println(" Thank you ! Calculator closed");
	
	}
}