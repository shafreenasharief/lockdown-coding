# Python program to count Even and Odd numbers in a List 
  
# list of numbers 
list1 =[2, 7, 5, 64, 14]
list2 = [12, 14, 95, 3]
  
even_count, odd_count = 0, 0
num = 0
  
# using while loop      
while(num < len(list1)): 
      
    # checking condition 
    if list1[num] % 2 == 0: 
        even_count += 1
    else: 
        odd_count += 1
      
    # increment num  
    num += 1
      
print("Even:", even_count) 
print("Odd: ", odd_count)
even_count=0
odd_count=0
num = 0
while(num < len(list2)): 
      
    # checking condition 
    if list2[num] % 2 == 0: 
        even_count += 1
    else: 
        odd_count += 1
      
    # increment num  
    num += 1
      
print("Even:", even_count) 
print("Odd: ", odd_count)
