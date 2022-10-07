package extendWeightCalculator;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Grade grade = new Grade();
        //new 3 arrays of pointTotal, earnedPoints, and assignment respectively.
        double[] pointTotal = new double[8];
        double[] earnedPoints = new double[8];
        double[] assignment = new double[8];
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
        System.out.println("Enter your total points in 8 subjects: ");
        for (int i = 0; i < 8; i++) {
            pointTotal[i] = scanner.nextDouble();
        }
        grade.setPointTotal(pointTotal);
        //prompt the user to enter the earned points for each exam, and pass the value into the earnedTotal array we created before
        System.out.println("Enter your earned points in 8 subjects: ");
        for (int i = 0; i < 8; i++) {
            earnedPoints[i] = scanner.nextDouble();
        }
        grade.setEarnedPoints(earnedPoints);
        //prompt the user to enter the assignment percentage for each exam, and pass the value into the assignment array we created before
        System.out.println("Enter your assignment percentage in 8 subjects: ");
        for (int i = 0; i < 8; i++) {
            assignment[i] = scanner.nextDouble();

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
