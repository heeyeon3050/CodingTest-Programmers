package org.example.level0.test120906;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1234));
    }
}

class Solution {
    public int solution(int n) {
        int sum = 0;
        String answer = n + "";
        char[] arr = answer.toCharArray();

        for(int i=0; i<arr.length; i++){
            sum += Character.getNumericValue(arr[i]);
        }
        return sum;
    }
}

class Solution1 {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] arr = str.split("");

        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}

class Solution2 {
    public int solution(int n) {
        int sum = 0;

        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}

class Solution3 {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}

