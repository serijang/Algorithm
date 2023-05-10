class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        
        if (Math.ceil(num) == Math.floor(num)) {
            return (long) ((num+1) * (num+1));
        } else {
            return -1;
        }
    }
}