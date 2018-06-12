/* ----------------------------------------------------------------------------
*	By: Danielle Danskin
* 	Created: 06/12/2018
* 	Last updated: 06/12/2018
*
*	Compilation: javac Quicksort.java
* 	Execution: java Quicksort
*
*	This program sorts an array using quicksort.
* ---------------------------------------------------------------------------*/
import java.io.*;
import java.util.Random;

public class Quicksort {
    public Quicksort(int[] arr) {
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
        
        Quicksort newSort = new Quicksort(arr);
        
        // print final sorted array
        System.out.println("Sorted array: ");

        newSort.printArray(arr);
        */
	}
}

