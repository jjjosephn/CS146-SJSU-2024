When first approaching this homework problem, I had to first draw out everything that was happening. I first noticed that the root would usually be lowest common ancestor among most p and q values, since it's directly in the middle of a BST. Then I noticed that everytime either a p or a q is on either side of the root, then I would be returning a root. Later, I noticed that everytime both p and qs were on the same side of the BST it would usually be the parent of both p and qs. Knowing this, I implemented 3 conditions:
    1. if the root equals p or q then return the root
    2. if p and q are on the right or left side of the root, set the next node as the "root" whether its left or right
    3. if p is less than the root, and q is greater than the root, then return the root
