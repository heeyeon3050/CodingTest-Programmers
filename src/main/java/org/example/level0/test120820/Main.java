package org.example.level0.test120820;

// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.

class Main {
    public static void main(String[] args) {
        System.out.println(new org.example.level0.test120820.Solution().solution(40));
    }
}
class Solution {
    public int solution(int age) {
        return 2023 - age;
    }
}