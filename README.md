# 401-data-structures-and-algorithms

Code Challenge: Class 11
Challenge Summary
Implement a Queue using two Stacks.

Challenge Description
Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach. dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.

Approach & Efficiency
To understand how to construct a queue using two stacks, you should understand how to reverse a stack crystal clear. Remember how stack works, it is very similar to the dish stack on your kitchen. The last washed dish will be on the top of the clean stack, which is called as Last In First Out (LIFO) in computer science. Our queue model will consist of two stacks. One stack will be used for enqueue operation (will be called as Input Stack), another stack will be used for the dequeue operation (will be called as Output Stack).

We will Reverse the input Stack to get an output Stack, which we will use it to dequeue.

Solution
![pop](https://user-images.githubusercontent.com/79080942/125199575-75c4a180-e26f-11eb-8c1a-0476c45b73b0.png)

