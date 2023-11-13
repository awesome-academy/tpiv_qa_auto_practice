import java.util.Date;

public class FormalStudent extends Student{
    public FormalStudent() {}

    public FormalStudent(int code, String name, Date birthDate, int entryYear, float entryScore) {
        super(code, name, birthDate, entryYear, entryScore);
    }
}
