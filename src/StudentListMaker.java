import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentListMaker{


    //    Creates CSV files for student lists for various courses
    public StudentListMaker() throws NullPointerException, IOException {

//        Version 1:

        final String line = "hello";

        try (FileOutputStream apMathList = new FileOutputStream("src/student_lists/course1.csv");
             ObjectOutputStream objectOutput = new ObjectOutputStream(apMathList)) {
            objectOutput.writeObject(line);
        }

        try (FileOutputStream compSciList = new FileOutputStream("src/student_lists/course2.csv");
             ObjectOutputStream objectOutput = new ObjectOutputStream(compSciList)) {
            objectOutput.writeObject(line);
        }

        try (FileOutputStream statList = new FileOutputStream("src/student_lists/course3.csv");
             ObjectOutputStream objectOutput = new ObjectOutputStream(statList)) {
            objectOutput.writeObject(line);
        }
    }
}
