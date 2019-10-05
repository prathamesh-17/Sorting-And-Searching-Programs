package sortingAndSearching;

import java.util.Scanner;

public class SelectionSort {

	static void selection(int a[])
	{
		int small,pos;
		for(int i=0; i<a.length-1;i++)
		{
			small = a[i];
			pos = i;
			for(int j=1; j<a.length; j++)
			{
				if(a[j]<small)
				{
					small = a[j];
					pos = j;
				}
			}
			int temp = a[i];
			a[i] = a[pos];
			a[pos] = temp;
			
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
		selection(a);
		System.out.print("Sorted elements are :\n");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	
	}

}
