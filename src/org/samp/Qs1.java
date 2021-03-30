package org.samp;

import java.util.Scanner;

public class Qs1 {
	public static void main(String[] args) {
		
		
		System.out.println("varsha");
		System.out.println("Cse");
		System.out.println("Greenss");
		System.out.println("Enter any Number :");
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact= fact*i;
			}
			System.out.println("Factorial of number :"+fact);
		}

		
	}


