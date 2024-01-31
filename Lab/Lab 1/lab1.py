nums = [0,1,8,7,3,9]
target = 16
solution = []

dictionary = {
}

length = len(nums)

for i in range(length):
    total = 0
    total = target - nums[i]
    
    if dictionary.get(total) is None:
        dictionary.update({nums[i]:i})
    else:
        solution.append(dictionary.get(total))
        solution.append(i)

print(solution)
print("Indices " + str(solution[0]) + " and " + str(solution[1]))
