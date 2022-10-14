package lab4;

import java.util.List;

public class lab4Grade {
    //Here we initial four private attributes
    private List<Double> pointTotal;
    private List<Double> earnedPoints;
    private List<Double> assignment;

    private double weightGrade;

    //Here we generate getter and setter for each attributes in order to edit and call in the main function
    public double getWeightGrade() {
        return weightGrade;
    }

    public void setWeightGrade(double weightGrade) {
        this.weightGrade = weightGrade;
    }

    public List<Double> getPointTotal() {
        return pointTotal;
    }

    public void setPointTotal(List<Double> pointTotal) {
        this.pointTotal = pointTotal;
    }

    public List<Double> getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(List<Double> earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public List<Double> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<Double> assignment) {
        this.assignment = assignment;
    }

    //We need a calculate function here to calculate the final grade by using every time earnPoints/totalPoint * assignment
    public void calculate(){
        double sum = 0;
        for (int i = 0; i < pointTotal.size(); i++){
            sum += this.earnedPoints.get(i) / this.pointTotal.get(i) * this.assignment.get(i);
        }
        this.weightGrade = sum;


    }
}
