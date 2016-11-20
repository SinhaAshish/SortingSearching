package binarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter the number to search ");
		int num = in.nextInt();
		int index=BinearySearch(num , arr);
		if(index!=-1)
		{
			System.out.println(" The numner is found at " + (index+1));
		}
		else {
			System.out.println(" The number is not found");
		}
		


	}
	public static int BinearySearch( int num , int arr[])
	{
		int low=0;
		int high= arr.length-1;
		while( low<=high)
		{	int mid = (low+high)/2;
			if(num== arr[mid])
			{
				return mid;
			}
			if(num< arr[mid])
			{
				high = mid-1;
			}
			else if(num > arr[mid])
			{
				low= mid+1;
			}
		}
		 return -1;
	}

}
