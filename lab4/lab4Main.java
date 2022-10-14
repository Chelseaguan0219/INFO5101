package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lab4Grade grade = new lab4Grade();
        //new 3 arrays of pointTotal, earnedPoints, and assignment respectively.
        List<Double> pointTotal = new ArrayList<>();
        List<Double> earnedPoints = new ArrayList<>();
        List<Double> assignment = new ArrayList<>();
        //prompt the user to enter the total points for each exam, and pass the value into the pointTotal array we created before.
        //Test Case:
        // Total possible points:
        //
        //20,30,40,50,60,100,200,300
        //
        //Percentages by assignment
        //
        //10, 10, 10, 10, 10, 10, 15, 25
        //
        //Earned Scores
        //
        //20,30,40,50,60,100,100,300
        //
        //Total grade = 92.5 which is an "A"
        //prompt the user to type in the total points
        System.out.println("Please enter your total points for each assignment: ");
        Double input1 = Double.valueOf(sc.nextLine());
        while (input1 != -1.0) {
            pointTotal.add(input1);
            input1 = Double.valueOf(sc.nextLine());
        }
        grade.setPointTotal(pointTotal);
        //prompt the user to type in the earned points
        System.out.println("Please enter your earned points for each assignment: ");
        Double input2 = Double.valueOf(sc.nextLine());
        while (input2 != -1.0) {
            earnedPoints.add(input2);
            input2 = Double.valueOf(sc.nextLine());
        }
        grade.setEarnedPoints(earnedPoints);
        //prompt the user to type in the assignment percentage
        System.out.println("Please enter your assignment percentage for each assignment: ");
        Double input3 = Double.valueOf(sc.nextLine());
        while (input3 != -1.0) {
            assignment.add(input3);
            input3 = Double.valueOf(sc.nextLine());
        }
        grade.setAssignment(assignment);
        //print the final score with final grade level
        System.out.print("The student's grade is: ");
        grade.calculate();
        System.out.println(grade.getWeightGrade());
        System.out.print("The student's  grade level is: ");

        if (grade.getWeightGrade() >= 90 && grade.getWeightGrade() <= 100) {
            System.out.print("A");
        } else if (grade.getWeightGrade() >= 80 && grade.getWeightGrade() <= 89.9999) {
            System.out.print("B");
        } else if (grade.getWeightGrade() >= 70 && grade.getWeightGrade() < 80) {
            System.out.print("C");
        } else if (grade.getWeightGrade() >= 60 && grade.getWeightGrade() < 70) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }

    }

}
