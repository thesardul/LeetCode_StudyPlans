package com.thesardul.StudyPlan.ProgrammingSkills.ProgrammingSkills_1.basicDataType;

public class AverageSalaryExcludingMinAndMaxSalary {
    public static void main(String[] args) {
        int [] sal = {4000,3000,1000,2000};
        System.out.println(average(sal));
    }

    private static double average(int[] sal) {
        int len = sal.length;
        double sum = 0;
        int minSal = Integer.MAX_VALUE, maxSal = Integer.MIN_VALUE;

        for(int i  = 0; i < len; i++){
            if(sal[i] < minSal)
                minSal = sal[i];
            if(sal[i] > maxSal)
                maxSal = sal[i];
            sum += sal[i];
        }
        return (sum - (minSal + maxSal)) / (len - 2);
    }
}
