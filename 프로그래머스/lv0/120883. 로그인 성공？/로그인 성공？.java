import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i=0; i<= db.length-1; i++) {
            if(Arrays.equals(id_pw,db[i])) {
                answer = "login";
                break;
            } else if (id_pw[0].equals(db[i][0]) 
                       && !id_pw[1].equals(db[i][1])) {
                answer = "wrong pw";
                break;
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
}