import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length+1];
        
        for(int i = 0; i<= numbers.length-1; i++) {
            if(direction.equals("right")) {
                answer[i+1] = numbers[i];
                answer[0] = numbers[numbers.length-1];
            }else if(direction.equals("left")){
                answer[i] = numbers[i];
                answer[answer.length-1] = numbers[0];
            }
        }
        return direction.equals("right") ? Arrays.copyOfRange(answer, 0, answer.length-1) : Arrays.copyOfRange(answer, 1, answer.length);
    }
}


// List 이용
class Solution {
    public ArrayList solution(int[] numbers, String direction) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            answer.add(numbers[i]);
        }

        int targetValue = 0;

        if(direction.equals("right")){
            answer.add(0, numbers[numbers.length-1]);
            answer.remove(answer.size()-1);

        }else{
            answer.add(numbers[0]);
            answer.remove(0);
        }

        return answer;
    }
}

// List, Stream 이용
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
