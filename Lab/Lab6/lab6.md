To solve this problem  I had to first recognize that if there was a loop between any courses, then the whoel thing would automatically return false, else it'd return true. So I implemented an adjacency list to have the key as every unique element, and the value as the courses they're pointed to. I would then implement a tracker using dfs that would cycle through the list and add its value into the tracker. And if the a value is shown to be repeated in a tracker then there would be a loop, so return false. All other cases return true