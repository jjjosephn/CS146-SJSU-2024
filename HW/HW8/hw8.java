public class hw8{
    public int longestPalindrome(String s) {
        int[] chars1 = new int[128];
        for (char c: s.toCharArray()){
            chars1[c]++;
        }

        int res = 0;

        for (int chars2: chars1){
            res += chars2 /2 * 2;
            if(res % 2 == 0 && chars2 % 2 == 1){
                res += 1;
            }
        }
        return res;
    }
}
