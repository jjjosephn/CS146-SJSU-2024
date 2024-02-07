When solving this problem, I mapped out an example of 20 versions, when version 15 was the first bad version. Previous to this course, I learned about binary search, which is an algorithm where you would continuously cut the size by half. In doing so, I started off with two hands (left and right) where left would start at 0, and right would start at the last version. I would iterate through a loop, where if left is less than or equal to the right I would find the midpoint. So when mapping out the problem, everytime I would land on a bad version I would move the right hand to the midpoint and -1 (since we already know that version is bad) and leave a solution marker on the midpoint before it was subtracted by 1. I would do the same thing if the midpoint I landed on was good, but instead, I would move the left hand to that midpoint and add 1 (since we already know that version is good). I would continue the loop until left = right, and whatever the solution is landed on, I would then return it.