import java.util.Arrays;

public class hw7{
    public static int minMeetingRooms(int[][] intervals) {  
        Arrays.sort(intervals, (m1, m2) -> m1[0] - m2[0]);
        int servers = 1;

        for (int i = 1; i < intervals.length; i++){
            int[] current = intervals[i];
            int[] previous = intervals[i - 1];

            if(current[0] < previous[1]){
                servers++;
            }
            else{
                continue;
            }
        }
        return servers;
    }
    public static void main(String[] args) {
        int[][] intervals = {{0,30}, {5,10}, {15,25}};
        int[][] intervals2 = {{0,1}, {1,2}, {2,3}};
        int[][] intervals3 = {{1,5}, {0,9}, {1,6}};
        int[][] intervals4 = {{1, 3}, {2, 5}, {3, 7}, {4, 9}, {6, 8}, {3, 7}};

        System.out.println((minMeetingRooms(intervals)));
        System.out.println((minMeetingRooms(intervals2)));
        System.out.println((minMeetingRooms(intervals3)));
        System.out.println((minMeetingRooms(intervals4)));
        
    }
}
