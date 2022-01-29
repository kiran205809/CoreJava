package test;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int Number = scanner.nextInt();
		if (Number%2==0){
			System.out.println("Number is Even Number");
		}
			else {
				System.out.println("Number is odd number");
			}
			scanner.close();
		}

	}


