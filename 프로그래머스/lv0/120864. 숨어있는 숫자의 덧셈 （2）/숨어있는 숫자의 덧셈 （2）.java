class Solution {
    public int solution(String my_string) {
        String temp = "";
        int answer = 0;
        Boolean flag = false;
        for (int i = 0; i<= my_string.length()-1; i++) {
            if(my_string.charAt(i) >= 48 && my_string.charAt(i)<= 57) {
                temp += my_string.charAt(i);
                flag = true;
        } else {
                if(flag == true) {
                temp += ",";
                }
                flag = false;
            }
        }
        if(temp == "") {
            answer = 0;
        } else {
        String[] result = temp.split(",");
        for(int j = 0; j<= result.length-1; j++) {
                answer += Integer.parseInt(result[j]);
            }
        }
        return answer;
    }
}