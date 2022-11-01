class Solution {
    public String solution(int age) {
        char[] answer = String.valueOf(age).toCharArray();
        
        for(int i = 0; i<= answer.length-1; i++) {    
            answer[i] = (char) (answer[i] + 49);
        }
        return String.valueOf(answer);
    }
}