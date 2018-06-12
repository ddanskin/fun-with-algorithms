/* ----------------------------------------------------------------------------
*	By: Danielle Danskin
* 	Created: 06/12/2018
* 	Last updated: 06/12/2018
*
*	Compilation: javac MergeSort.java
* 	Execution: java MergeSort
*
*	This program sorts an array using merge sort.
* ---------------------------------------------------------------------------*/
import java.io.*;
import java.util.Random;

public class MergeSort {
    public MergeSort(int[] arr) {

        if (arr.length >= 2) {
        
            int groupSize = 2;
    
            while (groupSize <= arr.length) {

                for (int i = 0; i < arr.length; i+=groupSize) {
                
                    for (int j = i; j < groupSize; j++) {
                        int a = i;
                    }
                    if(arr[i] > arr[i+1]) {
                        swapValues(arr, i, i+1);
                    }
                    printArray(arr);
                }
                groupSize *= 2;
            }
        }
	}

    public void swapValues(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void printArray(int[] arr) {
 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

	public static void main(String[] args) throws IOException{
        /* test case
        int[] arr = new int[]{23,12,54,6,9,1,37,12,76,24};
        
        MergeSort newSort = new MergeSort(arr);
        
        // print final sorted array
        System.out.println("Sorted array: ");

        newSort.printArray(arr);
        */
	}
}
