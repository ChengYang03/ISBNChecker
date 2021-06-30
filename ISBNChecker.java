import java.util.Scanner;

public class ISBNChecker{
	public static void main(String[] args) {
		System.out.print("Enter 13-digit ISBN :");
		Scanner scnr = new Scanner(System.in);
		//get input from the user
		long numISBN =  scnr.nextLong();
		//convert long to string
		String s = Long.toString(numISBN);
		//break the input in single digits
		long x13 = numISBN %10 ;
		long x12 = numISBN/10;
		 x12 = x12%10 ;
		long x11 = numISBN/100;
		 x11 = x11%10;
		long x10 = numISBN/1000;
		 x10 = x10 %10;
		long x9 = numISBN/10000;
		 x9 = x10 %10;
		long x8 = numISBN/100000;
		 x8 = x8 %10;
		long x7 = numISBN/1000000;
		 x7 = x7 %10;
		long x6 = numISBN/10000000;
		 x6 = x6 %10;
		long x5 = numISBN/100000000;
		long c = x5;
		 x5 = x5 %10;
		long x4 = c/10;
		 x4 = x4 %10;
		long x3 = c/100;
		 x3 = x3 %10;
		long x2 = c/1000;
		 x2 = x2 %10;
		long x1 = c/10000;
		 x1 = x1 %10;
		 //identify is the input is valid by using the equation
		long x = (x1+3*x2+x3+3*x4+x5+3*x6+x7+3*x8+x9+3*x10+x11+3*x12+x13)%10;
		
		
		//identify is the lengths of input that user enter equal to 13
		if (s.length() !=13){
			System.out.println("Error _ number Exceeds 13 digits");
		}
		
		




		else if (x == 0) {
			System.out.println("Number is valid!");
		}
		else{
			System.out.println("Number is invalid!");

		}
	}
}