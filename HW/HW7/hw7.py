from typing import List

class hw7:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: x[0])
        servers = 1

        for i in range(1, len(intervals)):
            current = intervals[i]
            previous = intervals[i - 1]

            if current[0] < previous[1]:
                servers += 1
            else: 
                continue
        return servers

hw7 = hw7()
intervals = [[0,30], [5,10], [15,25]]
intervals2 = [[0,1], [1,2], [2,3]]
intervals3 = [[1,5], [0,9], [1,65]]
intervals4 = [[1,3], [2,5], [3,7], [4,9], [6,8], [3,7]]

print(hw7.minMeetingRooms(intervals))
print(hw7.minMeetingRooms(intervals2))
print(hw7.minMeetingRooms(intervals3))
print(hw7.minMeetingRooms(intervals4))
