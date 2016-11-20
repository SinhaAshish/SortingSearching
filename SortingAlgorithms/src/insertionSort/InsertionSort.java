package insertionSort;

public class InsertionSort {

	public static void main( String args[])
	{
		int arr[]={ 9,8,7,6,5,4,3,2,1};
		printArray( arr);
		InsertionSort(arr);
		System.out.println("\nThe sorted Array After Insertion Sort is ");
		printArray( arr);
		
	}
	public static void printArray( int arr[])
	{
		for( int i =0; i< arr.length; i++)

		{
			System.out.print(arr[i] +" ");
		}
	}
	public static void InsertionSort( int arr[])
	{	for(int i=1; i <=arr.length-1 ; i++)
		{	int value = arr[i];
			int hole = i;
			while( hole>0 && arr[hole-1]>value)
			{
				arr[hole]=arr[hole-1];
				hole= hole -1;
				arr[hole]= value;
			}
		}
	}
}
