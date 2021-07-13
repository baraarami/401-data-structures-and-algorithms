# Code Challenge: Class 12
# First-in, First-out Animal Shelter
# Challenge-12

# Create a class called AnimalShelter which holds only dogs and cats.
The shelter operates using a first-in, first-out approach.
The shelter should have an enqueue(animal) method that will add either a cat or dog object to the shelter.
The shelter should also have a dequeue(pref) method that takes a preference of either cat or dog and returns either a cat or dog based on that preference.
Approach and Efficiency
enqueue Big O: O(n)
dequeue Big O:O(1)
# Solution
[]()


# Code Challenge: Class 13
# stack-queue-brackets

# Challenge

Write a method named multiBracketValidation that, given a string, returns true or false if that string has balanced brackets.
Approach and Efficiency
The approach for this challenge was to use a stack or dynamic array to track every instance of a closing bracket found.
as they will then need to has an opening one before.
Whenever a closing bracket is found, the previous value from the array of opening brackets is checked to see what type of closing bracket should be expected.
If an oppening bracket does not match what it should be, the method will return false.
This method has a Big O time and space efficiency of O(n) .

# Solution
[]()