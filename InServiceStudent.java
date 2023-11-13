import java.util.Date;

public class InServiceStudent extends Student{
    String jointTrainingPlace;

    public InServiceStudent(){}

    public InServiceStudent(int code, String name, Date birthDate, int entryYear, float entryScore){
        super(code, name, birthDate, entryYear, entryScore);
    }

    public InServiceStudent(int code, String name, Date birthDate, int entryYear, float entryScore, String jointTrainingPlace) {
        super(code, name, birthDate, entryYear, entryScore);
        this.jointTrainingPlace = jointTrainingPlace;
    }

    public String getJointTrainingPlace() {
        return jointTrainingPlace;
    }

    public void setJointTrainingPlace(String jointTrainingPlace) {
        this.jointTrainingPlace = jointTrainingPlace;
    }
}
