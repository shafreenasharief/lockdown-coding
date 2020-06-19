import java.io.*; 

import java.util.*; 

class FindSmallestInteger  

{ 

    // Returns the smallest number that cannot be represented as sum 

    // of subset of elements from set represented by sorted array arr[0..n-1] 

    int findSmallest(int arr[], int n)  

    { 

        int res = 1; // Initialize result 

  

        // Traverse the array and increment 'res' if arr[i] is 

        // smaller than or equal to 'res'. 

        for (int i = 0; i < n && arr[i] <= res; i++) 

            res = res + arr[i]; 

  

        return res; 

    }

}

public class Main

{

  

    // Driver program to test above functions 

    public static void main(String[] args)  

    { 

        FindSmallestInteger small = new FindSmallestInteger(); 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int n = sc.nextInt();

        System.out.println("Enter the array elements");

        int[] arr = new int[n];

        for(int i=0;i<n;i++)

        {

            arr[i] = sc.nextInt();

        }

        System.out.println(small.findSmallest(arr, n)); 

    } 

}
