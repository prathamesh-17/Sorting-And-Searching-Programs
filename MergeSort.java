package sortingAndSearching;

import java.util.Scanner;

public class MergeSort {
	static void split(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			split(a,0,mid);
			split(a,mid+1,high);
			combine(a,low,mid,high);
		}
		
	}
	static void combine(int a[],int low,int mid,int high)
	{
		int i = low, k = low;
		int c[] = new int[100];
		int j = mid+1;
		while(i<=mid && j<=high)
		{
			if(a[i] < a[j])
			{
				c[k] = a[i];
				k++;
				i++;
			}
			else
			{
				c[k] = a[j];
				k++;
				j++;
			}
		}
		if(i>mid)
		{
			while(j<=high)
			{
				c[k] = a[j];
				k++;
				j++;
			}
		}
		if(j>high)
		{
			while(i<=mid)
			{
				c[k] = a[i];
				k++;
				i++;
			}
		}
		for(int m=low; m<=high; m++)
		{
			a[m] = c[m]; 
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
		split(a,0,n-1);
		System.out.print("Sorted elements are :\n");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	}

}
