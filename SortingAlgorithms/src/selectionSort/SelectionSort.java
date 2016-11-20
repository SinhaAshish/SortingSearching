package selectionSort;



public class SelectionSort {

	public static void main( String args[])
	{
		int arr[]={ 9,8,7,6,5,4,3,2,1};
		printArray( arr);
		SelectionSort(arr);
		System.out.println("\nThe sorted Array After Selection Sort is ");
		printArray( arr);
		
	}
	public static void printArray( int arr[])
	{
		for( int i =0; i< arr.length; i++)

		{
			System.out.print(arr[i] +" ");
		}
	}
	public static void SelectionSort( int arr[])
	{	for(int i=0; i <=arr.length-2 ; i++)
		{	int min = i;
			for(int j = i+1; j<=arr.length-1; j++)
			{	if(arr[j]<arr[min])
				{	min= j;	}					
			}
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min]=temp;
		}
	}
}
