# Intuition and Approach
<!-- Describe your first thoughts on how to solve this problem. -->
1.  Find the length of input string
    ```
    int length  = s.length();
    ```

---

2. Traverse the string from index-(0) to index-(length/2)
    ```
    for(short i=0; (i<length/2); i++)
    ```
<p align="center">
<img src="https://assets.leetcode.com/users/images/d8555677-a157-4206-9775-65f7f16ca002_1692596930.0106654.gif" width="400" height="150"/>
</p>

---

3. Check if the length of string is divisible by length of substring
    - Because a substring should be a multiple copies of main string
    ```
    length%(i+1)==0
    ```
<p align="center">
<img src="https://assets.leetcode.com/users/images/948408ca-df51-43c3-a994-0334cbf07300_1692600272.6266916.jpeg" width="500" height="250"/>

---

4.  Extract the substring and keep repeating it until ***Length(subString) = Length(string)***
    ```
    // Extract substring 
    String subString = (s.substring(0,i+1));
    // Repeat  substring for Length(string)/Length(subString) times
    subString = subString.repeat(length/(i+1)); 
    ```
<p align="center">
<img src="https://assets.leetcode.com/users/images/04a598dd-42fb-4b72-b516-c1e3cfa6b270_1692602630.2253296.jpeg" width="500" height="250"/>

---

5. Return True if ***Multiple copies(subString) = String***
    - If there isn't such substring it'll not return true, instead will return false
    ` if( subString.equals(s) )   return true; `

# Complexity
- Time complexity: **O(n)**, Where n = Length(String)/2
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: **O(n)**, for each *subString computed* in loop.
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Completion Time
- Runtime: **8 ms**
- Memory: **43.9 MB**
