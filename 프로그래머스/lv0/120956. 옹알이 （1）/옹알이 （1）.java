class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i=0; i<= babbling.length-1; i++) {
            for(int j=0; j<= str.length-1; j++) {
                if(babbling[i].contains(str[j])) {
                    babbling[i] = babbling[i].replace(str[j], "0");
                }
            }
        }
        for(int c =0; c <= babbling.length-1; c++) {
            babbling[c] = babbling[c].replace("0", "");
            if(babbling[c].equals("")) {
                answer++;
            }
        }
        return answer;
    }
}