class Solution {
    public int solution(int[] array, int n) {
        int temp = 0;
        int answer = 0;
        int cnt = 0;
        temp = Math.abs(array[0]-n);
        
        for(int i = 0; i<= array.length-1; i++) {
            if(temp > Math.abs(array[i] - n)) {
                temp = Math.abs(array[i] - n);
                cnt = i;
            } else if (temp == Math.abs(array[i] - n)) {
                cnt = array[cnt] > array[i] ? i : cnt ;
         } 
            
    }   return array[cnt];
}
}