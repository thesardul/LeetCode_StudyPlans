package com.thesardul.StudyPlan.ProgrammingSkills.ProgrammingSkills_1.Day2;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int number = 00000000000000000000000000001011;
        System.out.println(hammingWeight(number));
    }

    public static int hammingWeight(int n) {
        int setBitCount = 0;
        while (n != 0) {
            n &= (n - 1);
            ++setBitCount;
        }
        return setBitCount;
    }
}
