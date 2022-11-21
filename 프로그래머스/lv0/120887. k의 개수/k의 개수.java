class Solution {
    public int solution(int i, int j, int k) {
        String temp = "";
        int result = 0;
        for (; i <= j; i++) {
            temp += i;
        }
        String[] answer = temp.split("");
        
        for (int a = 0; a <= answer.length-1; a++) {
            if(answer[a].equals(String.valueOf(k))) {
                result++;
            }
        }
        
        return result;
    }
}