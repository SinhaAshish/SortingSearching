package mergeSort;

public class MergeSort {

	public static void main( String args[])
	{
		int arr[]={ 9,8,7,6,5,4,3,2,1};
		printArray( arr);
		MergeSort(arr);
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
	public static void MergeSort(int arr[])
	{	if( arr.length<2)
		return;
		int mid= arr.length/2;
		int left[] =  new int[mid];
		int right[] = new int[arr.length- mid];
		for( int i=0; i<mid; i++)
		{
			left[i]=arr[i];
		}
		for(int j=mid; j<(arr.length); j++)
		{
			right[j-mid]=arr[j];
		}
		MergeSort(left);
		MergeSort(right);
		Merge(left,right,arr);
		
	}
	public static void Merge( int left[] , int right[], int arr[])
	{
		System.out.println(" Ashish");
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)
		{
			if( left[i]<=right[j])
			{	arr[k]=left[i];
				i++;
			}
			else
			{	arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length)
		{
			arr[k]=left[i];
			i++;k++;
		}
		while(j<right.length)
		{
			arr[k]=right[j];
			j++;k++;
		}
	}
}
