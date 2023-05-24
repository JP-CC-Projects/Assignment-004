import java.io.FileOutputStream;
import java.io.IOException;

public class StudentListMaker3 {

    //      Creates CSV files for student lists for various courses
    public StudentListMaker3() throws NullPointerException, IOException {

    //      Version 3:

        int i = 0;
        final String line = "hello";

        try (FileOutputStream apMathList = new FileOutputStream("src/student_lists/course1.csv");
             FileOutputStream compSciList = new FileOutputStream("src/student_lists/course2.csv");
             FileOutputStream statList = new FileOutputStream("src/student_lists/course3.csv")) {
        }
    }
}
