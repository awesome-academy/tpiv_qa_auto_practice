import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    // String to Date
    public static Date formatStringToDate(String dateInString) {
        String patern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(patern);
        Date date = null;

        try {
            date = dateFormat.parse(dateInString);
        } catch (ParseException e) {
            System.out.println("Invalid date. Please input date in dd/MM/yyyy.");
        }
        return date;
    }

    // Date to String
    public static String formatDateToString(Date date) {
        String patern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(patern);
        String dateInString = dateFormat.format(date);
        return dateInString;
    }

    public static void main(String[] args){
        // khoi tao khoa
        Department D1 = new Department("Department 1");

        // khai bao bien nhap du lieu tu ban phim
        try (Scanner input = new Scanner(System.in)) 
        {
            // nhap du lieu sinh vien
            System.out.println("The number of students that you want to add: ");
            int totalStudents = input.nextInt();

            // nhap thong tin cho tung sinh vien
            for (int i = 0; i < totalStudents; i++) 
            {
                System.out.println("Input information of student number " + (i+1) + "\n");

                System.out.println("This student is a formal student? (true/ false)");
                boolean isFormalStudent = input.nextBoolean();

                System.out.println("Code: ");
                int code = input.nextInt();
                
                input.nextLine();
                System.out.println("Name: ");
                String name = input.nextLine();

                System.out.println("Date of birth: ");
                String birthDateInString = input.next();
                Date birthDate = formatStringToDate(birthDateInString);

                System.out.println("Entry year: ");
                int entryYear = input.nextInt();

                System.out.println("Entry score: ");
                float entryScore = input.nextFloat();

                // khoi tao sinh vien chinh quy/ tai chuc dua tren xac nhan va cac thong tin da nhap phia tren
                if (isFormalStudent) 
                {
                    FormalStudent student = new FormalStudent(code, name, birthDate, entryYear, entryScore);
                    D1.addStudent(student);
                }
                else 
                {
                    input.nextLine();
                    System.out.println("Joint Training Place: ");
                    String jointTrainingPlace = input.nextLine();

                    InServiceStudent student = new InServiceStudent(code, name, birthDate, entryYear, entryScore, jointTrainingPlace);
                    D1.addStudent(student);
                }
            }

            // nhap diem cho tung hoc ky cua tung sinh vien
            System.out.println("The number of students that you have to submit scores: ");
            int totalStudentsHaveScore = input.nextInt();

            for (int i = 0; i < totalStudentsHaveScore; i++) 
            {
                System.out.println("Input code of student number " + (i+1) + "\n");
                int inputCode = input.nextInt();

                for (Student student: D1.getStudents()) 
                {
                    if (inputCode == student.getCode()) 
                    {
                        System.out.println("Total semesters that have scores inputting: ");
                        int totalSemesters = input.nextInt();

                        for (int j =0; j <totalSemesters; j++) 
                        {
                            System.out.println("Semester: ");
                            String semester = input.next();

                            System.out.println("Average score of " + semester + " : ");
                            float avgScore = input.nextFloat();

                            Result result = new Result(semester, avgScore);
                            student.addResult(result);
                        }
                    }
                }
            }
        }

        // in ra thong tin tong so sinh vien va so sinh vien chinh quy cua khoa
        int numberOfStudentInDepartment = D1.getStudents().toArray().length;

        // truong hop khoa khong co sinh vien
        if (numberOfStudentInDepartment == 0) 
        {
            System.out.println(D1.getName() + " has any students.\n");
            return;
        }

        // truong hop khoa co sinh vien

        // in ra tong so sinh vien cua khoa
        System.out.println("Total students in " + D1.getName() + " : " + numberOfStudentInDepartment + "\n");

        // in ra tong so sinh vien chinh quy cua khoa
        System.out.println("Total formal students in " + D1.getName() + " : " + D1.totalFormalStudents() + "\n");
        
        // in ra sinh vien co diem dau vao cao nhat cua khoa
        System.out.println("The student(s) has the highest entry score = " + D1.highestEntryScore() + " is:");
        for (Student student: D1.highestEntryScoreStudents()) 
        {
            System.out.println("Code: " + student.getCode() + ", Name: " + student.getName() + ", Entry Score: " + student.getEntryScore() + ", Entry Year: " + student.getEntryYear());
        }
        System.out.println("\n");

        // in ra danh sach ket qua hoc tap cua tung sinh vien trong khoa
        System.out.println("List results of students in " + D1.getName() + ":\n");
        for (Student student : D1.getStudents()) 
        {
            // in ra thong tin ma, ten va hinh thuc hoc cua tung sinh vien trong khoa
            System.out.println("Code: " + student.getCode() + ", Name: " + student.getName() + ", Type: " +
                (student.isFormalStudent() ? "Formal Student" : "In-service Student"));

            // in ra diem cua sinh vien (neu co)
            if (student.getResults().toArray().length == 0) 
            {
                System.out.println("Student that has code " + student.getCode() + " has any scores.\n");
            }
            else 
            {
                // in ra diem cua tung ky
                for (Result result: student.getResults()) 
                {
                System.out.println("Semester " + result.getSemester() + " : " + result.getAvgScore());
                }

                // in ra GPA hien tai cua sinh vien (neu co)
                System.out.println("Current GPA of student " + student.getName() + " :" + student.getGPA() + "\n");
            }
        }
    }
}
