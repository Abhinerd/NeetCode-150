### [Problem Link](https://neetcode.io/problems/anagram-groups/question)

---

### Approach
Make a 26 sized array (number of letters)

For each string, we will count the frequency of every letter using this array

This array will then be converted to a string and used aa a key in our hashmap of the type `<String, List<String>>`

Each string, we will count freqeucies and put them in the hashmaps

Anagrams get grouped together automatically

At the end, just take all the values of the HashMap and you're done

---

### Time and space complexity
n = number of strings in strs
k = maximum length of a string

- **Time Complexity = O(n.k)**
    - Iterating over the string characters ->  O(k)
    - Thus, for n strings -> O(n⋅k)
- **Space Complexity = O(n.k)**
    - In the worst case (no anagrams), each string stored once -> O(n · k) total characters stored.

---