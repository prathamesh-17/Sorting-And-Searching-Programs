package sortingAndSearching;

import java.util.Scanner;

public class InsertionSort {

	static void insertion(int a[])
	{
		for(int i=1; i<a.length; i++)
		{
			int y = a[i];
			int j = i-1;
			while(j>=0 && a[j]>y)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		insertion(a);
		System.out.print("Sorted elements are :\n");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	

	}

}
