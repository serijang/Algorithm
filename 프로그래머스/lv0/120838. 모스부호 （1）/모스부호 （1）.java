import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");
        for(int i = 0; i<= morse.length-1; i++) {
            for(int j = 0; j<= letterArr.length-1; j++) {
                if(letterArr[j].equals(morse[i])) {
                    letterArr[j] = String.valueOf((char) (i + 97));
                }
            }
        }
        return String.join("", letterArr);
    }
}