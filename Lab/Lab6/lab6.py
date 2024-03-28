import collections


class lab6:
    def canFinish(numCourses, prerequisites):
        adjList = collections.defaultdict(list)

        for course,pre in prerequisites:
            adjList[pre].append(course)

        def cyc(node, track, visited):
            track[node] = True
            visited[node] = True

            for n in adjList[node]:
                if n not in visited and cyc(n, track, visited):
                    return True
                elif n in track:
                    return True
            track.pop(node)
            return False

        visited = {}
        for n in range(numCourses):
            track = {}
            if n not in visited and cyc(n, track, visited):
                return False
        
        return True
