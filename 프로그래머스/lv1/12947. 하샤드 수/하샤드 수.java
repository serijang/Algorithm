class Solution {
    public boolean solution(int x) {
        int temp = 0;
        int answer = x;
        
        while(x > 0) {
            temp += x % 10;
            x /= 10;
        }
        
        return answer % temp == 0 ? true : false;
    }
}