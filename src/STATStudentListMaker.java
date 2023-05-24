import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class STATStudentListMaker{
    public STATStudentListMaker(String[] studentDataLine) throws NullPointerException, IOException {


        try (FileOutputStream compSciList = new FileOutputStream("src/student_lists/course2.csv");
             ObjectOutputStream objectOutput = new ObjectOutputStream(compSciList)) {
            objectOutput.writeObject(studentDataLine);
        }
    }
}