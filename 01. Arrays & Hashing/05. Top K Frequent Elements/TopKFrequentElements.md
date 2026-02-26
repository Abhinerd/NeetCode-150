### [Problem Link](https://neetcode.io/problems/top-k-elements-in-list/question?list=neetcode150)

---

### Approach
Count frequencies with a HashMap, then reverse-map (frequency → list of elements) using a TreeMap in descending order. Collect elements from highest frequency until k elements are gathered.

---

### Time and space complexity
- Time Complexity: O(n log n)

    n for counting, log n for TreeMap operations

- Space Complexity: O(n)

    store counts and reverse mapping

---