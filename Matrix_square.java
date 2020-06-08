package matrix;
import java.io.*; 
public class Matrix_Square {
	    static int N = 3;
	    static boolean isMagicSquare(int mat[][]) 
	    { 
	         int sum = 0,sum2=0;  
	        for (int i = 0; i < N; i++) 
	            sum = sum + mat[i][i]; 
	  
	        // the secondary diagonal 
	        for (int i = 0; i < N; i++) 
	            sum2 = sum2 + mat[i][N-1-i]; 
	  
	        if(sum!=sum2)  
	            return false; 
	  
	        // For sums of Rows 
	        for (int i = 0; i < N; i++) { 
	  
	            int rowSum = 0; 
	            for (int j = 0; j < N; j++) 
	                rowSum += mat[i][j]; 
	            if (rowSum != sum) 
	                return false; 
	        } 
	  
	        // For sums of Columns 
	        for (int i = 0; i < N; i++) { 
	  
	            int colSum = 0; 
	            for (int j = 0; j < N; j++) 
	                colSum += mat[j][i]; 
	            if (sum != colSum) 
	                return false; 
	        } 
	  
	        return true; 
	    } 
	    public static void main(String[] args) 
	    { 
	        int mat[][] = {{ 2, 7, 6 }, 
	                       { 9, 5, 1 }, 
	                       { 4, 3, 8 }}; 
	  
	        if (isMagicSquare(mat)) 
	            System.out.println("Magic matrix"); 
	        else
	            System.out.println("Not a magic" + 
	                                    " matrix"); 
	    }
}
