from typing import List

def threeSum(nums: List[int]) -> List[List[int]]:
    nums.sort()
    outputList = []

    for i in range(len(nums) - 2):
        if i == 0 or (i > 0 and nums[i] != nums[i - 1]):
            j = i + 1
            k = len(nums) - 1
            sum = 0 - nums[i]

            while j < k:
                if nums[j] + nums[k] == sum:
                    outputList.append([nums[i], nums[j], nums[k]])
                    while j < k and nums[j] == nums[j + 1]:
                        j += 1
                    while j < k and nums[k] == nums[k - 1]:
                        k -= 1
                    j += 1
                    k -= 1
                elif nums[j] + nums[k] > sum:
                    k -= 1
                else:
                    j += 1  
    return outputList
                    
nums = [-5, -5, 0, 5, -10, 0, 5]
print(threeSum(nums))
