class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int remainCoupon = 0;
        
        while(coupon >= 10) {
            remainCoupon = coupon % 10; // 10마리가 안될때 남는 쿠폰 수
            answer += coupon/10; // 쿠폰으로 시킬 수 있는 치킨 수
            coupon = remainCoupon + coupon/10;  // 시켜먹은 치킨에 대한 쿠폰 + 남는 쿠폰
        }
        return answer;
    }
}