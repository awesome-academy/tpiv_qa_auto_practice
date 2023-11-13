public class Result {
    private String semester;
    private float avgScore;

    // constructor
    public Result(){}

    public Result(String semester, float avgScore) {
        this.semester = semester;
        this.avgScore = avgScore;
    }

    // getter
    public String getSemester() {
        return semester;
    }

    public float getAvgScore() {
        return avgScore;
    }

    // setter
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }
}
