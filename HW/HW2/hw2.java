//Assuming the API bool isBadVersion is applied

public class hw2{
    public int firstBadVersion(int n){
        int left = 0;
        int right = n;
        int solution = 0;

        while (left <= right){
            int midpoint = left + (right-left) / 2;
            if (isBadVersion(midpoint)){
                solution = midpoint;
                right = midpoint - 1;
            }
            else {
                left = midpoint + 1;
            }
        }
        return solution;
    }
}
