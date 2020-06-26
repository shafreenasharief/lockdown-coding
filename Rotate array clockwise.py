''
Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 
Input:
First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
Output:
For each testcase, in a new line, output the rotated array.
Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105
Example:
Input:
5 2
1 2 3 4 5 
output:
3 4 5 1 2
'''
def leftRotate(arr, d, n): 
    for i in range(d): 
        leftRotatebyOne(arr, n) 
  
# Function to left Rotate arr[] of size n by 1*/  
def leftRotatebyOne(arr, n): 
    temp = arr[0] 
    for i in range(n-1): 
        arr[i] = arr[i + 1] 
    arr[n-1] = temp 
          
  
# utility function to print an array */ 
def printArray(arr, size): 
    for i in range(size): 
        print ("% d"% arr[i], end =" ") 
  
   
# Driver program to test above functions */ 
arr = [1, 2, 3, 4, 5] 
leftRotate(arr, 2, 5) 
printArray(arr, 5)
