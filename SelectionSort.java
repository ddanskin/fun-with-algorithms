/* ----------------------------------------------------------------------------
*	By: Danielle Danskin
* 	Created: 06/10/2018
* 	Last updated: 06/12/2018
*
*	Compilation: javac SelectionSort.java
* 	Execution: java SelectionSort
*
*	This program sorts an array using selection sort.
* ---------------------------------------------------------------------------*/
import java.io.*;
import java.util.Random;

public class SelectionSort {
    public SelectionSort(int[] arr) {
        int n = arr.length;
        int min;
    
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swapValues(arr, i , min);
            printArray(arr);
        }
	}

    public void swapValues(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void printArray(int[] arr) {
    
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

	public static void main(String[] args) throws IOException{
        int[] arr = new int[]{23,12,54,6,9,1,37,12,76,24};
        
        SelectionSort newSort = new SelectionSort(arr);
        
        // print final sorted array
        System.out.println("Sorted array: ");

        newSort.printArray(arr);
	}
}
