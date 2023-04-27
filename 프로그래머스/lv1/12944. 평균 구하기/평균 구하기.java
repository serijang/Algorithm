class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<= arr.length-1; i++) {
            answer += arr[i];
        }
        return answer / arr.length;
    }
}