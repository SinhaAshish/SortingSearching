package quickSort;

public class QuickSortDemo {

	public static void main( String args[])
	{
		int arr[]={9,8,7,6,5,4,3,2,1};
		printArray( arr);
		QuickSort(arr, 0 ,arr.length-1);
		System.out.println("\nThe sorted Array After Quick Sort is ");
		printArray( arr);
		
	}
	public static void printArray( int arr[])
	{
		for( int i =0; i< arr.length; i++)

		{
			System.out.print(arr[i] +" ");
		}
	}
	public static void QuickSort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int partionIndex= Partition(arr,start, end);
			QuickSort(arr, start, partionIndex-1);
			QuickSort(arr, partionIndex+1,end);
			
		}
		
	}
	public static int Partition( int arr[], int start,int end)
	{
		int pivot= arr[end];
		int PartitionIndex= start;
		for(int i=start; i<end; i++)
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[i];
				arr[i]=arr[PartitionIndex];
				arr[PartitionIndex]= temp;
				PartitionIndex++;
			}
		}
		int temp1=arr[PartitionIndex];
		arr[PartitionIndex]= arr[end];
		arr[end]=temp1;
		return PartitionIndex;
		
		}
}
	
