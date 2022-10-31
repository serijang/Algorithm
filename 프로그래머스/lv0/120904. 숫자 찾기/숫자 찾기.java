class Solution {
    public int solution(int num, int k) {
        String answer = String.valueOf(num);
        int result = 0;
        
        for (int i = 0; i<= answer.length()-1; i++) {
           if(answer.charAt(i) == k+48) {  // i번째의 문자가 숫자 k의 아스키코드와 같아야함
               result = i+1;
               break;
           } else {
               result = -1;
           }
        }
        return result;
    }
}