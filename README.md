# 401-data-structures-and-algorithms
## Challenge 05:Linked List
A LinkedList class and Node class. The LinkedList keeps track of what node is its head value, and each node contains its own value and a pointer to the node after it in the list.

 ### Challenge Summary
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node. Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created. This object should be aware of a default empty value assigned to head when the linked list is instantiated. Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance. Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list. Define a method called print which takes in no arguments and outputs all of the current Node values in the Linked List.

 ### Approach & Efficiency
The approach for the

insert method Node O(1).
includes O(n).
toString O(n)
# API
# Insert
takes in an integer value to assign to a new node and inserts it at the head of the linked list

# Includes
Searches the linked list to see if any node contains the provided value and will return true if so, otherwise returns false.

# To string
Will print out the list formatted as: "{ a } -> { b } -> { c } -> NULL"

![Linked List Implementation](https://user-images.githubusercontent.com/79080942/125162482-c74a2f00-e190-11eb-9dc5-6a1f1b7a6522.png)





# Challenge 06: Implement different insertion methods
# Challenge Summary
Add an append challenge to your LinkedList class that takes a value and adds it at the end of the Linked List. Add an insertBefore function to your LinkedList class that takes in a value and newValue, and inserts a new Node before the Node that contains the given value. Add an insertAfter function to your LinkedList class that takes in a value and newValue, and inserts a new Node after the Node that contains the given value. Approach and Efficiency The approach for all these methods involves iterating over the Nodes in the Linked List until reaching the given position where the new Node needs to be inserted. The new Node is then created and inserted into the list by updating other Nodes next value where necessary. All three of these functions take O(n) time and O(1) space.

# Whiteboard Solution
![cc6](https://user-images.githubusercontent.com/79080942/125163104-2d848100-e194-11eb-8053-df27d8dd3b18.png)


# Challenge 07: Linked List Find K From End
# Challenge Summary
Write a method for your LinkedList class that takes in an integer k and returns the value from the kth node from the end of the list.

Approach and Efficiency
The approach for this method was to start by looking at the head of the list, and then look k nodes forward from there and see if the next value of that node is null. If that node k away from the current has a next value of null then it will return the value from the current node. If not, then the current node will be set to the next in the list until either the proper node is found or the function has to throw an error due to being out of the bounds of the list. The time of this method is O(n) and the space is O(1).

# Whiteboard Solution

![chc7 png](https://user-images.githubusercontent.com/79080942/125163301-388be100-e195-11eb-8f41-03cedfa9e40a.png)



# Challenge 08: Zip Two Linked Lists
# Challenge Summary
Write a static method for your LinkedList class that takes in two LinkedLists and zip them together, alternating nodes from each list, and returns the head of the new list

# Approach and Efficiency
The approach for this method was to merge the second list into the first one, simply adding values after each node from the original list. To achieve this a counter is used while moving through both the lists, and every time the counter is an even number a node from the 2nd List is inserted into the first. It will also handle cases where one of the two lists are longer than the other, and if one or both lists are empty (head points to null). The Big O time efficiency for this solution is O(n) and the space efficiency is O(1).

# Whiteboard Solution
![cc88](https://user-images.githubusercontent.com/79080942/125164640-f7e39600-e19b-11eb-9e43-23eb70c8dbc8.png)





