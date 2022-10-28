public class WeightCal {
    //Private attributes created
    private float pointTotal;
    private float earnedPoints;
    private float assignment;

    //Use a constructor
    public WeightCal(float inputTotal, float inputEarned, float inputAss) {

        this.pointTotal = inputTotal;
        this.earnedPoints = inputEarned;
        this.assignment = inputAss;
    }
    //There are four public methods we have for the attributes

    public float getPointTotal() {
        return pointTotal;
    }

    public float getEarnedPoints() {
        return earnedPoints;
    }

    public float getAssignment() {
        return assignment;
    }
    //getWeight() has its formula
    public double getWeight() {
        return  (double) earnedPoints / pointTotal * assignment * 100;
    }
}
