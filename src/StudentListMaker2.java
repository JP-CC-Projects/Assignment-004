import java.io.FileOutputStream;
import java.io.IOException;

public class StudentListMaker2 {

    //    Creates CSV files for student lists for various courses
    public StudentListMaker2() throws NullPointerException, IOException {

//        List Counter starts at 1:
        int listCounter = 1;

//        Number of lists/courses:
        int numOfStudentLists = 3;

//        Version 2:
        while (listCounter <= numOfStudentLists) {
            try (FileOutputStream studentListMaker = new FileOutputStream("src/student_lists/course"
                    + listCounter + ".csv")){
                System.out.println("Created Student List CSV File " + listCounter) ;
                listCounter++;
            }
        }
    }
}
