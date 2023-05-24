import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentListMaker{

    FileOutputStream apMathList = null;
    FileOutputStream compSciList = null;
    FileOutputStream statList = null;
    //    Creates CSV files for student lists for various courses
    public StudentListMaker() throws NullPointerException, IOException {

//        Version 1:

        final String line = "hello";

        try (FileOutputStream apMathList = new FileOutputStream("src/student_lists/course1.csv");
             ObjectOutputStream objectOutput = new ObjectOutputStream(apMathList)) {
            objectOutput.writeObject(line);
        }


        try {
            compSciList = new FileOutputStream("src/student_lists/course2.csv");
            System.out.println("Created Student List CSV File 2");
        } finally {
            if (compSciList != null) {
                compSciList.close();
            }
        }

        try {
            statList = new FileOutputStream("src/student_lists/course3.csv");
            System.out.println("Created Student List CSV File 3");
        } finally {
            if (statList != null) {
                statList.close();
            }
        }
    }
    public FileOutputStream[] studentListsAsObjects(){
        FileOutputStream[] studentListObjectArr = {apMathList, compSciList, statList};
        return studentListObjectArr;

    }
}
