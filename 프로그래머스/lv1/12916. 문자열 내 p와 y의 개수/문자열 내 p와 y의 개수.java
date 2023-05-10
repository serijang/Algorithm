class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;
        
        for(int i=0; i<= s.length()-1; i++) {
            if(s.charAt(i) == 'p') {
                pNum++;
            } else if (s.charAt(i) == 'y') {
                yNum++;
            }
        }
        
        if(pNum == 0 && yNum == 0) {
            return true;
        } else if (pNum == yNum) { 
            return true;
        } else {
            return false;
        }
    }
}