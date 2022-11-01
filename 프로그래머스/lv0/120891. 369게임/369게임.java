class Solution {
    public int solution(int order) {
        int answer = 0;
        String temp = String.valueOf(order);
        for(int i = 0; i<= temp.length()-1; i++) {
            if(temp.charAt(i) != '0' && temp.charAt(i) % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}