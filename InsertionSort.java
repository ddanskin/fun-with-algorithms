/* ----------------------------------------------------------------------------
*	By: Danielle Danskin
* 	Created: 06/12/2018
* 	Last updated: 06/12/2018
*
*	Compilation: javac InsertionSort.java
* 	Execution: java InsertionSort
*
*	This program sorts an array using insertion sort.
* ---------------------------------------------------------------------------*/
import java.io.*;
import java.util.Random;

public class InsertionSort {
    public InsertionSort(int[] arr) {
        int n = arr.length;
    
        for (int i = 0; i < n; i++) {
            int curr = i;
            while ( i != 0 && arr[curr] < arr[curr-1]) {
                swapValues(arr, curr, curr-1);
                curr--;
            }
            printArray(arr);
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
        
        InsertionSort newSort = new InsertionSort(arr);
        
        // print final sorted array
        System.out.println("Sorted array: ");

        newSort.printArray(arr);
        */
	}
}

