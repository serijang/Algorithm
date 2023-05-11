import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] arr = new char[str.length()];
        
        for(int i=0; i<= str.length()-1; i++) {
            arr[i] = str.charAt(i);
        }
        
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer(String.valueOf(arr));
        String s = sb.reverse().toString();
        
        return Long.parseLong(s);
    }
}