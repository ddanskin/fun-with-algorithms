/* ----------------------------------------------------------------------------
*	By: Danielle Danskin
* 	Created: 06/10/2018
* 	Last updated: 06/10/2018
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
       /* int min;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            arr2.push(min);
        }*/

	}

	public static void main(String[] args) throws IOException{
	    InputStreamReader stream = new InputStreamReader (System.in);
	    BufferedReader bufferedReader = new BufferedReader(stream);

        System.out.println("Enter sort name: ");
        String sortName = bufferedReader.readLine();
        
        System.out.println("Enter the number of items to sort: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(100) + 1;
        }
        SelectionSort newSort = new SelectionSort(arr);
        System.out.println("Sort type: " + sortName);
        System.out.println("Array size: " + n);
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\n");

	}
}
