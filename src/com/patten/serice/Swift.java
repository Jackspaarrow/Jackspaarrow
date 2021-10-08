package com.patten.serice;

import java.util.Scanner;

public class Swift 
{
	public static void main(String[] args) 
	{
		Swift s = new Swift();
		s.rightSwift();
		s.leftSwift();
	}
	private void leftSwift() 
	{
		int a[] = {10,20,30,40,50};
		int temp;
		Scanner  s = new Scanner(System.in);
		System.out.print("Enter the swift postion Left side:");
		int n = s.nextInt();
		for(int i = 0;i<n;i++)
		{	
			int k = 0;
			for(int j = a.length-1;j>0;j--)
			{
				temp = a[k];
				a[k] = a[j];
				a[j] = temp;
				
			}
		}
		System.out.print("Left side swift:"); 
		for(int i = 0;i<a.length;i++)
		{
			System.out.print("|"+a[i]+"|");
		}
	}

	private void rightSwift() 
	{
		int a[] = {10,20,30,40,50};
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the swift postion right side:");
		int n = s.nextInt();
		for(int i = 0;i<n;i++)
		{
			int temp;
			for(int j = i+1;j<a.length;j++)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.print("right side swift:"); 
		for(int i = 0;i<a.length;i++)
		{
			System.out.print("|"+a[i]+"|");
		}
		System.out.println();
	}
}
