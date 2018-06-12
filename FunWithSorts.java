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

        System.out.println("Enter sort name: ");
        String sortName = bufferedReader.readLine();
        
        System.out.println("Enter the number of items to sort: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        int [] arr = new int[n];

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

	}
}
