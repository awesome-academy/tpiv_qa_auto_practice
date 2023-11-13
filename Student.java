//import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Student {
    private int code;
    private String name;
    private Date birthDate;
    private int entryYear;
    private float entryScore;
    private List<Result> results = null;

    public Student(){}
    public Student(int code, String name, Date birthDate, int entryYear, float entryScore) {
        this.code = code;
        this.name = name;
        this.birthDate = birthDate;
        this.entryYear = entryYear;
        this.entryScore = entryScore;
    }

    // getter
    public int getCode(){
        return this.code;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public float getEntryScore() {
        return entryScore;
    }

    public List<Result> getResults() {
        if (results == null) {
            results = new ArrayList<>();
        }
        return results;
    }

    // setter
    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public void setEntryScore(float entryScore) {
        this.entryScore = entryScore;
    }

    public void setResultList(List<Result> results) {
        this.results = results;
    }

    // kiem tra sinh vien co phai sinh vien chinh quy hay khong
    public boolean isFormalStudent(){
        return this instanceof FormalStudent;
    }

    // them du lieu diem tung hoc ky cua sinh vien
    public void addResult(Result result){
        getResults().add(result);
    }

    // tinh GPA cua sinh vien
    public float getGPA(){
        float sum = 0;
        for (Result result: this.results){
            sum = sum + result.getAvgScore();
        }
        return sum/results.toArray().length;
    }
}
