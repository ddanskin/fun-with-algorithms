/* ----------------------------------------------------------------------------
*	By: Danielle Danskin
* 	Created: 06/12/2018
* 	Last updated: 06/12/2018
*
*	Compilation: javac FunWithSorts.java
* 	Execution: java FunWithSorts
*
*	This program takes in a sort type and an array length and creates a random
*	array of integers between 1-100.
* ---------------------------------------------------------------------------*/
import java.io.*;
import java.util.Random;

public class FunWithSorts {
	public static void main(String[] args) throws IOException{
	    InputStreamReader stream = new InputStreamReader (System.in);
	    BufferedReader bufferedReader = new BufferedReader(stream);

        System.out.println("Choose a sort: selection, merge, bubble, insertion, quicksort, or heapsort ");
        String sortName = bufferedReader.readLine().trim();
        
        System.out.println("Enter the number of items to sort: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        int [] arr = new int[n];

        // add random numbers to the array
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Sort type: " + sortName);
        System.out.println("Array size: " + n);
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\n");
        

        if (sortName.equals("selection")) {
            SelectionSort arrSort = new SelectionSort(arr);
        } else if (sortName.equals("merge")) {
            MergeSort arrSort = new MergeSort(arr);
        } else if (sortName.equals("bubble")) {
            BubbleSort arrSort = new BubbleSort(arr);
        } else if (sortName.equals("insertion")) {
            InsertionSort arrSort = new InsertionSort(arr);
        } else if (sortName.equals("quicksort")) {
            Quicksort arrSort = new Quicksort(arr);
        } else if (sortName.equals("heapsort")) {
            Heapsort arrSort = new Heapsort(arr);
        } else {
            System.out.println("Sorry, I don't know that sorting method.");
        }
	}
}
