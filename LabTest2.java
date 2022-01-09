package quizAndLabtest;

import java.util.Scanner;

public class LabTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double  wage = 5;
		int hours;
		double sales;
		double commission;
		
		System.out.print("Enter sales : ");
		sales = sc.nextDouble();
		System.out.print("Enter hours worked : ");
		hours = sc.nextInt();
		
		double dailyWage =(double) 5 * hours;
		System.out.println("Daily wages : " + dailyWage);
		
		if ((sales >= 150) && (sales <= 300)) {
			commission = (sales * 5) / 100;
			System.out.println("Commission : " + commission);
		}
		
		if ((sales >= 301) && (sales <= 500)) {
			commission = (sales * 10) / 100;
			System.out.println("Commission : " + commission);
		}
		
		if (sales >500) {
			commission = (sales * 15) / 100;
			System.out.println("Commission : " + commission);
		}
	}

}
