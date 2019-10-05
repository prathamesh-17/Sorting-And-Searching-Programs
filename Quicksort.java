package sortingAndSearching;

import java.util.Scanner;

public class Quicksort {
	
	static void quicksort(int a[],int low,int high)
	{
		if(low<high)
		{
			int pivot_pos = partition(a,low,high);
			quicksort(a,low,pivot_pos-1);
			quicksort(a,pivot_pos+1,high);
		}
	}
	static int partition(int a[],int low,int high)
	{
		int pivot = a[(low+high)/2];
		while(low<=high)
		{
			while(a[low]<pivot)
			{
				low++;
			}
			while(a[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
			}
		
		}
		return low;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		quicksort(a,0,n-1);
		System.out.print("Sorted elements are :\n");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	}

}
