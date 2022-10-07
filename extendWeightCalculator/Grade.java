package extendWeightCalculator;

public class Grade {
    //Here we initial four private attributes
    private double[] pointTotal;
    private double[] earnedPoints;
    private double[] assignment;

    private double weightGrade;

    //Here we generate getter and setter for each attributes in order to edit and call in the main function
    public double getWeightGrade() {
        return weightGrade;
    }

    public void setWeightGrade(double weightGrade) {
        this.weightGrade = weightGrade;
    }

    public double[] getPointTotal() {
        return pointTotal;
    }

    public void setPointTotal(double[] pointTotal) {
        this.pointTotal = pointTotal;
    }

    public double[] getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(double[] earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public double[] getAssignment() {
        return assignment;
    }

    public void setAssignment(double[] assignment) {
        this.assignment = assignment;
    }

    //We need a calculate function here to calculate the final grade by using every time earnPoints/totalPoint * assignment
    public void calculate(){
        double sum = 0;
        for (int i = 0; i < 8; i++){
            sum += this.earnedPoints[i] / this.pointTotal[i] * this.assignment[i];
        }
        this.weightGrade = sum;


    }


}
