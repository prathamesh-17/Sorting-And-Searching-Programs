package sortingAndSearching;

import java.util.Scanner;

public class BubbleSort {

	static void bubble(int arr[])
	{
		int temp;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j] > arr[j+1] )
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
		bubble(a);
		System.out.print("Sorted elements are :\n");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	
	}

}
