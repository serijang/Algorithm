import java.math.BigInteger;

class Solution {
    public int solution(String my_string) {
        String[] answer = my_string.split("\\s");
        BigInteger result = new BigInteger("0");
        result = result.add(new BigInteger(answer[0]));
        for(int i = 1; i<= (answer.length-1)/2; i++) {
            if(answer[2*i-1].equals("+")) {
                result = result.add(new BigInteger(answer[2*i]));
            } else {
                result = result.subtract(new BigInteger(answer[2*i]));
            }
        }
        return result.intValue();
    }
}