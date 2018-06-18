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

	}

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int point1 = 0;
        int point2 = 0;
        for (int i = 0; i < mergedArr.length; i++) {
            if (point1 >= arr1.length){
                mergedArr[i] = arr2[point2];
                point2++;
            } else if (point2 >= arr2.length) {
                mergedArr[i] = arr1[point1];
                point1++;
            } else if (arr1[point1] <= arr2[point2]){
                mergedArr[i] = arr1[point1];
                point1++;
            } else {
                mergedArr[i] = arr2[point2];
                point2++;
            }
        }    
        return mergedArr;
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
