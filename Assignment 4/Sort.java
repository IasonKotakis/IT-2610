package sorting;

import java.util.Random;

public class Sort {
	// swap the ith element with the jth elements.
	private void  swap(int[] a, int i, int j){
		int temp; 
		temp = a[i]; a[i] = a[j]; a[j] = temp;
	}
	// initialize the array a with elements from 0 to size-1. 
	public void  initializeArray(int[] a, int size){
		for (int i=0; i<size; i++){
			a[i]=i;
		}
	}
	
	// display the elements in the array a, 10 elements per row. 
	public void  displayArray(int[] a, int size){
		for (int i=0; i<size; i++){
			if(i%10==0){
				System.out.println();
			}
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	 // randomly swap two elements in array a for SWAPTIMES times. 
	 public void randomizeArray(int[] a, int size){
		final int SWAPTIMES = 10000;
		Random r = new Random();
        int j, k;
        for(int i=0; i< SWAPTIMES; i++){
    	    j = r.nextInt(size);
	        k = r.nextInt(size);
	        this.swap(a,  j, k);
        }
	}
	

	// insertionSort.	
	 public void  insertionSort(int[] arr, int size){
		for (int i = 1; i < size; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	
	// selectionSort
	public void selectionSort(int arr[], int size){
        for (int i = 0; i < size-1; i++) {
           int min_idx = i;
           for (int j = i+1; j < size; j++)
               if (arr[j] < arr[min_idx])
                   min_idx = j;
           int temp = arr[min_idx];
           arr[min_idx] = arr[i];
           arr[i] = temp;
       }
	}

    public int partition(int arr[], int low, int high)
    {
       int pivot = arr[high];
       int i = (low-1);
       for (int j=low; j<high; j++)
       {
           if (arr[j] <= pivot)
           {
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;

       return i+1;
    }
	 
	public void sortHelper(int arr[], int low, int high)
	{
	   if (low < high)
       {
           int pi = partition(arr, low, high);
           sortHelper(arr, low, pi-1);
           sortHelper(arr, pi+1, high);
       }
	}
	
	// quickSort
	public void quickSort(int[] a, int size)
    {
		int low = 0, high = size-1;
		sortHelper(a, low, high);
    }
	
}   
