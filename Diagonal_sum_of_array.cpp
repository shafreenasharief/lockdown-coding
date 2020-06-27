// A simple C++ program to find sum of diagonals 
#include <iostream> 
using namespace std; 
  
const int MAX = 100; 
  
void printDiagonalSums(int mat[][MAX], int n) 
{ 
    int main = 0, secondary = 0; 
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n; j++) { 
  
            
            if (i == j) 
                main += mat[i][j]; 
  
            
            if ((i + j) == (n - 1)) 
                secondary += mat[i][j]; 
        } 
    } 
  
    cout << "main Diagonal:" << main << endl; 
    cout << "Secondary Diagonal:" << secondary << endl; 
} 
  
// Driver code 
int main() 
{ 
    int a[][MAX] = { { 1, 2, 3}, { 4 ,3 ,2  },  
                    { 7 ,8 ,9 }}; 
    printDiagonalSums(a, 3); 
    return 0; 
}
