import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lab6 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int pre = prerequisite[1];
            adjList.computeIfAbsent(pre, k -> new ArrayList<>()).add(course);
        }

        Map<Integer, Boolean> visited = new HashMap<>();
        for (int n = 0; n < numCourses; n++) {
            Map<Integer, Boolean> track = new HashMap<>();
            if (!visited.containsKey(n) && cyc(n, track, visited, adjList))
                return false;
        }
        return true;
    }

    private boolean cyc(int node, Map<Integer, Boolean> track, Map<Integer, Boolean> visited,
                        Map<Integer, List<Integer>> adjList) {
        track.put(node, true);
        visited.put(node, true);

        for (int n : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.containsKey(n) && cyc(n, track, visited, adjList)) {
                return true;
            } else if (track.containsKey(n)) {
                return true;
            }
        }
        track.remove(node);
        return false;
    }
}
