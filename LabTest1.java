package quizAndLabtest;

import java.util.Scanner;

public class LabTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int itemQuantity,item1,item2,item3;
		double price1,price2,price3;
		double calculation1,calculation2,calculation3, calculationFinal, discount;
		
		System.out.println("Welcome to C_MARTS shopping complex");
		System.out.print("Enter the number of items : ");
		itemQuantity = sc.nextInt();
		System.out.println();
		
		if ( itemQuantity > 3 || itemQuantity < 0) {
			System.out.println("Invalid Output");
			sc.close();
		}
		
		System.out.print("Enter the price of first item : RM");
		price1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter the quantity of first item : ");
		item1 = sc.nextInt();
	
		
		if (itemQuantity == 2) {
			System.out.print("Enter the price of second item : RM");
			price2 = sc.nextInt();
			System.out.println();
			System.out.print("Enter the quantity of second item : ");
			item2 = sc.nextInt();
			
			calculation1 = item1 * price1;
			calculation2 = item2 * price2;
			calculationFinal = calculation1 + calculation2;
			System.out.println("First item price : " + calculation1);
			System.out.println("Second item price : " + calculation2);
			System.out.print("Total Price : " + calculationFinal);
			System.out.println();
			if (calculationFinal > 100) {
				discount = ((calculationFinal * 10) / 100);
				System.out.println("Discount recieved : " + discount);
				System.out.print("Total Price After discount : " + (calculationFinal - discount));
				sc.close();
			}
		} 
		
		else if (itemQuantity == 3) {
			System.out.print("Enter the price of second item : RM");
			price2 = sc.nextInt();
			System.out.println();
			System.out.print("Enter the quantity of second item : ");
			item2 = sc.nextInt();
			
			System.out.print("Enter the price of third item : RM");
			price3 = sc.nextInt();
			System.out.println();
			System.out.print("Enter the quantity of third item : ");
			item3 = sc.nextInt();
			
			calculation1 = item1 * price1;
			calculation2 = item2 * price2;
			calculation3 = item3 * price3;
			calculationFinal = calculation1 + calculation2 + calculation3;
			System.out.println("First item price : " + calculation1);
			System.out.println("Second item price : " + calculation2);
			System.out.println("Second item price : " + calculation3);
			System.out.print("Total Price : " + calculationFinal);
			System.out.println();
			if (calculationFinal > 100) {
				discount = ((calculationFinal * 10) / 100);
				System.out.println("Discount recieved : " + discount);
				System.out.print("Total Price After discount : " + (calculationFinal - discount));
				sc.close();
			}
			
			
		} 
		
		else if ( itemQuantity == 1 ) {
		calculation1 = item1 * price1;
		calculationFinal = calculation1;
		System.out.println("First item price : " + calculation1);
		System.out.print("Total Price : " + calculationFinal);
		System.out.println();
		if (calculationFinal > 100) {
			discount = ((calculationFinal * 10) / 100);
			System.out.println("Discount recieved : " + discount);
			System.out.print("Total Price After discount : " + (calculationFinal - discount));
		}
		}
		
	}

}
