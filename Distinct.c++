#include<bits/stdc++.h> 
#include<map> 
using namespace std; 
  
 
int atMostK(int arr[], int n, int k) 
{ 
  
    
    int count = 0;
    int left = 0;
    int right = 0; 
    map<int,int> map; 
    
    while (right < n) { 
  
        
        if (map.find(arr[right])==map.end()) 
            map[arr[right]]=0; 
        map[arr[right]]++; 
  
        while (map.size() > k) { 
            map[arr[left]]= map[arr[left]] - 1; 
            if (map[arr[left]] == 0) 
                map.erase(arr[left]); 
            left++; 
        } 
  
        
        count += right - left + 1; 
        right++; 
    } 
    return count; 
} 

int exactlyK(int arr[], int n, int k) 
{ 
  
    
    return (atMostK(arr, n, k) - atMostK(arr, n, k - 1)); 
} 
  
 
int main() 
{ 
    int arr[] = { 2, 1, 2, 1, 6 }; 
    int n = sizeof(arr)/sizeof(arr[0]); 
    int k = 2; 
  
    cout<<(exactlyK(arr, n, k)); 
}
