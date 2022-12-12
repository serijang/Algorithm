class Solution {
    public int solution(String A, String B) {
        String temp = A + A;
        if (A.equals(B)) {
            return 0;
        } else if (temp.contains(B)) {
            temp = temp.replace(B, "1");
        } else {
            return -1;
        }
        int answer = temp.indexOf("1");
        return A.length()-answer;
    }
}