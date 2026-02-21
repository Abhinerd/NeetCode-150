### [ProblemLink](https://neetcode.io/problems/duplicate-integer/question?list=neetcode150)

---

### Approach
Iterate thru all elements of the array while also putting them in a hashset
Before putting in the hashset, check if it is already there
- if it is, you found a dupli
- else, continue until the end, if you dont get a dupli, there were none
This method hinges on the fact that checking memebership in a hashset is O(1) time complexity

---

### Complexity
**Time Complexity = O(n)**
  Because all the elements of the array are bing iterate thru
**Space Complexity = O(n)**
  Because all the elements are being stored in a hashmap whose size can be the same as that of the input array

---