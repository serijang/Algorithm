class Solution {
    public int solution(int order) {
        int answer = 0;
        String temp = String.valueOf(order);
        for(int i = 0; i<= temp.length()-1; i++) {
            if(temp.charAt(i) != '0' && temp.charAt(i) % 3 == 0) { // 0을 '' 문자열 처리 안해줘서 시간낭비했음.
                answer++;
            }
        }
        return answer;
    }
}
