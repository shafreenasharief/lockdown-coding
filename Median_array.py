'''
Given the marks of all students, calculate the median.
Input:
The first line of input takes the number of test cases, T. For each test case there will be two lines. The first line contains an integer N denoting the number of students, and second line contains N space seperated integers which denotes the marks of N students.
Output:
Print the floor value of the median for each test case on a new line.
Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Marks <= 100
Example:
Input:
3
4
56 67 30 79
4
78 89 67 76
5
90 100 78 89 67
Output:
61
77
89
'''


from math import floor
t=int(input())
arr=[]
n=int(input())
for i in range(0,n):
    ele=int(input())
    arr.append(ele)
arr=sorted(arr)
mid=abs(int(len(arr)/2))
if n%2==1:
    arr5=arr[mid]
   
else:
    arr5=(arr[mid-1]+arr[mid])/2
    


arr1=[]
n1=int(input())
for i in range(0,n1):
    ele=int(input())
    arr1.append(ele)
arr1=sorted(arr1)
mid=abs(int(len(arr1)/2))
if n1%2==1:
    arr6=arr1[mid]
    
else:
    arr6=(arr1[mid-1]+arr1[mid])/2
    


arr2=[]
n2=int(input())
for i in range(0,n2):
    ele=int(input())
    arr2.append(ele)
arr2=sorted(arr2)
mid=floor((n2)/2)
if n2%2==1:
    arr7=arr2[mid]
    
else:
    arr7=(arr2[mid-1]+arr2[mid])/2
    
print("\n")
print(floor(arr5))
print(floor(arr6))
print(floor(arr7))
