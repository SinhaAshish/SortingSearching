package bubbleSort;

public class BubbleSort {

	public static void main( String args[])
	{
		int arr[]={ 9,8,7,6,5,4,3,2,1};
		printArray( arr);
		BubbleSort(arr);
		System.out.println("\nThe sorted Array After Bubble Sort is ");
		printArray( arr);
		
	}
	public static void printArray( int arr[])
	{
		for( int i =0; i< arr.length; i++)

		{
			System.out.print(arr[i] +" ");
		}
	}
	public static void BubbleSort( int arr[])
	{	for(int i=0; i <=arr.length-1 ; i++)
		{	for( int j= 0; j<= arr.length-2; j++)
			{	if( arr[j]>arr[j+1])
				{	int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
}
