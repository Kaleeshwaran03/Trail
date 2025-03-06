package programme;


import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the value");

		int number = a.nextInt();
		if (number<40) {
		     System.out.println("It is fail "+number);   
		    
		}
		else if (number>=40 && number<60) {
			System.out.println("The above value is A grade; "+number);
		}
		else if (number>=60 && number<80) {
			System.out.println("The above value is B grade: "+number);
		}
		     
		else {
		System.out.println("It is pass "+number);
		}



}
}