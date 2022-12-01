class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        int cnt = 0;
        for(; share >= 1; share--) {
            answer *= ((double)(balls-cnt)/share);
            cnt++;
        }
        return (int) Math.round(answer);
    }
}