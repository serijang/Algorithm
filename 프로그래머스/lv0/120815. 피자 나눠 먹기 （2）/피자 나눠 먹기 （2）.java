class Solution {
    public int solution(int n) {
        int answer = 0;
        Boolean flag = true;
    
        while(flag) {
            answer++;
            if((answer * 6) % n == 0) {
                flag = false;
            }
        }
        return answer;
    }
}