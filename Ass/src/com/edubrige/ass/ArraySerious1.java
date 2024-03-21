package com.edubrige.ass;

import java.util.Scanner;

public class ArraySerious1 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String studentType=s.next();
		 int tutionFee= s.nextInt();
		 int busFee= s.nextInt();
		 int hostelFee= s.nextInt();
		 double totalFee;
		 switch(studentType)
		 {
		 case "MSDS":
			 totalFee=tutionFee+busFee;
			 System.out.printf("%.2f",totalFee);
			 break;
		 case "MSH":
			 totalFee=tutionFee+hostelFee;
			 System.out.printf("%.2f",totalFee);
			 break;
		 case "MGSDS":
			 totalFee=1.50*tutionFee+busFee;
			 System.out.printf("%.2f",totalFee);
			 break;
		 case "MGSH":
			 totalFee=1.50*tutionFee+hostelFee;
			 System.out.printf("%.2f",totalFee);
			 break;
			 default:
			 System.out.println("Invalid");
		
		 }

	}

}
