public class hw1{

    public static boolean palindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        //loop ends when they reach the middle
        while (i < j){

            //check to see if the first pointer is at a letter/number or not, if not continue to next letter
            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }

            //check to see if the second pointer is at a letter/number or not, if not continue to next letter
            if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }

            //make sure both letters equal each other, if not return false
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }

            //increment/decrement to next letter if both letters equal each other
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("M$ad-Am"));
    }
}
