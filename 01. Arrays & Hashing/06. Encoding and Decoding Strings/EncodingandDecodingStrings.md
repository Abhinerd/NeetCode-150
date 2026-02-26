### [Problem Link](https://neetcode.io/problems/string-encode-and-decode/question?list=neetcode150)

---

### Approach
Use length-prefixed encoding: encode each string as [length]#[string]. Decode by reading the number before '#' and extracting that many characters.

---

### Time and space complexity
- Time Complexity: O(n)

    scan each character once

- Space Complexity: O(n)

    store encoded/decoded strings

---