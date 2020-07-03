''' 
Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. You are given  scores. Store them in a list and find the score of the runner-up.
Input Format:
The first line contains n. The second line contains an array A[] of n integers each separated by a space.
Output Format:
Print the runner-up score.
sample input:
5
2 3 6 6 5
sample output:
5
'''
if __name__ == '__main__':
    n = int(input())
    arr =list(map(int, input().split(" "))) 
    k = max(arr)
    for i in range(0,n):
        if max(arr) == k:   
            arr.remove(max(arr))
    arr.sort(reverse=True)
    print(arr[0])
