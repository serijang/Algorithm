class Solution {
    public int solution(int[] numbers, int k) {
        int[] answer = new int[2*k-1];
        int cnt = 0;
        int i = 1;
        while(cnt <= 2*k-2) {
            answer[cnt] = i;
            if(i > numbers.length) {
                i = 1;
             }
            cnt++;
            i++;
         }
        return answer[2*k-2];
    }
}