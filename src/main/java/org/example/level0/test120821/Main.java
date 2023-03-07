package org.example.level0.test120821;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution1().solution(new int[]{1, 2, 3, 4, 5})));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int n = 0;
        for(int i=num_list.length-1; i>=0; i--){
            answer[n++] = num_list[i];
        }
        return answer;
    }
}

class Solution1{
    public int[] solution(int[] num_list){
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
