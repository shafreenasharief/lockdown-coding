#include <iostream.h> 
using namespace std; 
int largestNum(int num) 
{ 
	string num_in_str = to_string(num); 
	string temp = num_in_str; 
	for (int i = 0; i < num_in_str.size(); i++) { 
		for (int j = i + 1; j < num_in_str.size(); j++) 
    { 
			swap(num_in_str[i], num_in_str[j]); 
			if (stoi(num_in_str) > stoi(temp)) 
				temp = num_in_str; 
			swap(num_in_str[i], num_in_str[j]); 
		} 
	} 

	return stoi(temp); 
} 
int main() 
{ 
	int num = 432; 
	cout << largestNum(num) << endl; 
	num = 2736; 
	cout << largestNum(num) << endl; 
	num = 4596; 
	cout << largestNum(num) << endl; 
	return 0; 
} 
