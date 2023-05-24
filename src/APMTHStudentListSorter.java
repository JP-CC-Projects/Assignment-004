import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class APMTHStudentListSorter {

    Integer i = 0;
    public APMTHStudentListSorter() throws Exception{
        try (FileOutputStream apMathList = new FileOutputStream("src/student_lists/course1.txt");
             ObjectOutputStream objectOutput = new ObjectOutputStream(apMathList)) {
            objectOutput.writeObject(i);
        }
    }
}
