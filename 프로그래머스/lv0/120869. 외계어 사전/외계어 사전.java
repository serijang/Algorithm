class Solution {
    public int solution(String[] spell, String[] dic) {
        int[] answer = new int[dic.length];
        int cnt = 0;
        for(int i=0; i<= spell.length-1; i++) {
            for(int j=0; j<= dic.length-1; j++) {
                if(dic[j].contains(spell[i])) {
                    answer[j]++;
                }
            }
        }
        for(int c=0; c<=answer.length-1; c++) {
            if(answer[c] == dic[c].length() && answer[c] == spell.length) {
                cnt = 1;
                break;
            } else {
                cnt = 2;
            }
        }
        return cnt;
    }
}