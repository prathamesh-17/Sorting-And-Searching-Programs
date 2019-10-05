package sortingAndSearching;

import java.util.Scanner;

public class BinarySearch {
	
	static int binarySearch(int a[],int x,int low,int high)
	{
		if(low>high)return -1;
		int mid = (low+high)/2;
		if(a[mid]>x)
		{
			return binarySearch(a,x,low,mid-1);
		}
		else if(a[mid]<x)
		{
			return binarySearch(a,x,mid+1,high);
		}
		else
		{
			return mid;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the elements in sorted oreder: ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the element to find:");
		int ele = sc.nextInt();
		int result = binarySearch(a,ele,0,n-1);
		if(result==-1)
		{
			System.out.println("Element not found.");
		}
		else
		{
			System.out.print("Element found at index: "+ result);
		}
		
		sc.close();
	}

}
