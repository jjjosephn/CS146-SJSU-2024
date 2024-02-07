#Assuming the API bool isBadVersion is applied
import math

def firstBadVersion(n: int):
    left = 0
    right = 0
    solution = 0

    while left <= right:
        midpoint = left + math.floor((right - left) / 2)
        if isBadVersion(midpoint):
            solution = midpoint
            right = midpoint - 1
        else:
            left = midpoint + 1
    return solution
