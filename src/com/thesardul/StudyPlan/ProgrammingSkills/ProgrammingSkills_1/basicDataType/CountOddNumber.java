package com.thesardul.StudyPlan.ProgrammingSkills.ProgrammingSkills_1.basicDataType;

public class CountOddNumber {
    public static void main(String[] args) {
        int low = 3, high = 7;
        System.out.println(getOddNumberCount(low, high));
    }

    private static int getOddNumberCount(int low, int high) {
        int num = high - low + 1;
        if(low % 2 != 0 && high % 2 != 0){
            return  num / 2 + 1;
        }
        else{
            return num / 2;
        }
    }
}
