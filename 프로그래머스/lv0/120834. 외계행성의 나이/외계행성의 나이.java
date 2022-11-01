class Solution {
    public String solution(int age) {
        char[] answer = String.valueOf(age).toCharArray();
        
        for(int i = 0; i<= answer.length-1; i++) {    
            answer[i] = (char) (answer[i] + 49);
        }
        return String.valueOf(answer);
    }
}

// 다른 풀이
class Solution {
    public String solution(int age) {
        String ageToOutsideAge = Integer.toString(age);
        String result = "";


        for(int i = 0; i < ageToOutsideAge.length(); i++)
        {
            result += (char)(ageToOutsideAge.charAt(i) + 49);

        }

        return result;
    }
}
