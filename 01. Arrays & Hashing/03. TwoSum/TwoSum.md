### [ProblemLink](https://neetcode.io/problems/two-integer-sum/question)

---

### Approach
Make a hashmap `<Element, Index>`
Iterate through the entire array while adding the values to the hashmap
Before adding, check if value-target exists, if it does, return the compliment's index and the current indiex

---

### Complexity
**Time Complexity = O(n)**
  Because all the elements of the array are iterated thru
  
**Space Complexity = O(n)**
  Because all the elements are being stored in a hashmap whose size can be the same as that of the input array

---