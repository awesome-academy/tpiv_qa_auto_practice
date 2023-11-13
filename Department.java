import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Student> students;

    public Department(){}

    public Department(String name){
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents(){
        if (students == null) {
            students = new ArrayList<>();
        }
        return students;
    }

    // them sinh vien vao khoa
    public void addStudent(Student student){
        getStudents().add(student);
    }

    // tong so sinh vien chinh quy cua khoa
    public int totalFormalStudents(){
        int total = 0;
        for (Student student: this.students){
            if (student.isFormalStudent()){
                total++;
            }
        }
        return total;
    }

    // diem dau vao cao nhat cua khoa
    public Float highestEntryScore(){
        float highestEntryScore = 0;
        for (Student student: this.students){
            if (student.getEntryScore() > highestEntryScore){
                highestEntryScore = student.getEntryScore();
            }
        }
        return highestEntryScore;
    }

    // danh sach sinh vien co diem dau vao cao nhat
    public List<Student> highestEntryScoreStudents(){
        List<Student> highestEntryScoreStudents = new ArrayList<>();

        for (Student student: this.students){
            if (student.getEntryScore() == this.highestEntryScore()){
                highestEntryScoreStudents.add(student);
            }
        }
        return highestEntryScoreStudents;
    }
}
