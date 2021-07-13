# 401-data-structures-and-algorithms
# Code Challenge: Class 13

# Multi-bracket Validation.

# Challenge

Write a method named multiBracketValidation that, given a string, returns true or false if that string has balanced brackets.
Approach and Efficiency
The approach for this challenge was to use a stack or dynamic array to track every instance of a closing bracket found.
as they will then need to has an opening one before.
Whenever a closing bracket is found, the previous value from the array of opening brackets is checked to see what type of closing bracket should be expected.
If an oppening bracket does not match what it should be, the method will return false.
This method has a Big O time and space efficiency of O(n) .

# Solution
![cc13](https://user-images.githubusercontent.com/79080942/125483532-4b239d99-703e-4c71-b947-34c3146a7214.png)
