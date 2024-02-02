import java.util.HashMap;
import java.util.Map;

public class lab2{
    static boolean anagram(String s, String t){
        Map <Character, Integer> lettersMap = new HashMap<Character, Integer>();

        s = s.toLowerCase();
        t = t.toLowerCase();
        int sLength = 0;
        int tLength = 0;

        //if there's a space in the string, I want to skip and add to actual string length
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            else{
                sLength++;
            }
        }

        for (int i = 0; i < t.length(); i++){
            if(t.charAt(i) == ' '){
                continue;
            }
            else{
                tLength++;
            }
        }
        
        //compare the string lengths without spaces
        if (sLength != tLength){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            if(!lettersMap.containsKey(s.charAt(i))){
                if (s.charAt(i) == ' '){
                    continue;
                }
                else{
                    lettersMap.put(s.charAt(i), 1);
                }
            }
            else{
                int count = lettersMap.get(s.charAt(i)) + 1;
                lettersMap.put(s.charAt(i), count);
            }
        }

        for (int i = 0; i < t.length(); i++){
            if (lettersMap.containsKey(t.charAt(i))){
                int minus = lettersMap.get(t.charAt(i)) - 1;
                lettersMap.put(t.charAt(i), minus);
            }
            if(lettersMap.get(t.charAt(i)) == null){
                continue;
            }
            if (lettersMap.get(t.charAt(i)) == -1 ){
                return false;
            }
        }

        for (int i = 0; i < sLength; i++){
            if(lettersMap.get(s.charAt(i)) == null){
                continue;
            }
            if(lettersMap.get(s.charAt(i)) != 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(anagram(" Dormitory", "Dirty Room"));
    }
}
