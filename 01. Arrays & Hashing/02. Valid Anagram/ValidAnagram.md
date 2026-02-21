### [ProblemLink](https://neetcode.io/problems/is-anagram/question)

---

### Approach
Find and store lengths of both strings, immediately return false if lengths are not equal
Create a `<Character,Integer>` hashmap to count occurences of each character
Iterate thru the first string
- if char not already in map, add character with- count 1
- else increase count by 1

Iterate thru second string
- if char is not in map, immediately return false
- else if char count becomes 0, return false
- else decrease char count by 1
if none of the earlier false conditions are tripped, return true

---

### Complexity
**Time Complexity = O(n)**
  Because all the elements of the string are iterated thru
  
**Space Complexity = O(n)**
  Because all the elements are being stored in a hashmap whose size can be the same as that of the input strings

---