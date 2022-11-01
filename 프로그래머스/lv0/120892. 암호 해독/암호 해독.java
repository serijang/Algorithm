class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=0; i <= cipher.length()-1; i++) {
            if((i+1) % code == 0) {
            answer += cipher.charAt(i);
            }
        }
        return answer;
    }
}


// 다른 풀이
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i = i + code) {  // 처음부터 i를 code의 수로 잡고, i += code로 증가.
            answer += cipher.substring(i - 1, i);
        }
        return answer;
    }
}
