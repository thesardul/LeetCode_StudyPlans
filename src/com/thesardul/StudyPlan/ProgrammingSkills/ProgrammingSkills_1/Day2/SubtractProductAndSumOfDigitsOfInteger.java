package com.thesardul.StudyPlan.ProgrammingSkills.ProgrammingSkills_1.Day2;

public class SubtractProductAndSumOfDigitsOfInteger {
    public static void main(String[] args) {
        int num = 4421;
        System.out.println(subtractProductAndSum(num));
    }

    public static int subtractProductAndSum(int n) {
        int temp = n;
        int prod = 1, sum = 0;
        while(temp > 0){
            int temp1 = temp % 10;
            prod *= temp1;
            sum += temp1;
            temp = temp / 10;
        }
        return Math.abs(prod - sum);
    }
}
