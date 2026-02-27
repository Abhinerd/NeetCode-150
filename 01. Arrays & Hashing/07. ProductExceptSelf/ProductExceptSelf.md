### [Problem Link](https://neetcode.io/problems/products-of-array-discluding-self/question?list=neetcode150)

---

### Approach
- Store prefix sum (excluding the current element) inside an array by traversing left to right
- Traverse right to left while calculating running sufix profuct and multiply with corresponding prefix product

---

### Time and space complexity
- Time Complexity: O(n)

- Space Complexity: O(n)

---