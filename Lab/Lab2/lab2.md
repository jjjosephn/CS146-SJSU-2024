When solving this lab, I implemented an idea one of my classmates had discussed in class, which is to iterate through the first string and include it in a hashmap, where the key is the letter, and the value is the occurance/frequency of the letter.
In order to have my function come out as true, I had to implement 3 conditions:
    1. If string1 and string2 are different lengths, return false. (spaces do not count)
    2. If the occuraance/frequency of a letter in the hashmap drops to -1, return false.
    3. If some or all letters in the hashmap, aren't 0 by the time the loop ends, return false.
