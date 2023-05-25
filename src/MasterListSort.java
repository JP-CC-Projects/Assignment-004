import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;

public class MasterListSort {

    public MasterListSort() throws Exception {
        String line = null;
        String[] lineData = {};
        ArrayList<Student> studentArr = new ArrayList<>();
        ArrayList<Student> sortedStudentList = new ArrayList<>();

        // Create Student POJOs, add them to ArrayList studentArr
        try (BufferedReader fileReader = new BufferedReader(
                new FileReader("src/student_lists/student-master-list.csv"))) {

            fileReader.readLine();
            while ((line = fileReader.readLine()) != null) {
                lineData = line.split(",");
                studentArr.add(new Student(
                        lineData[0],
                        lineData[1],
                        lineData[2],
                        lineData[3]));
            }
        }

        // Send studentArr to Quick Sort method quickSortStudentArr(),
        // quickSortStudentArr() will return an ArrayList<Student> sorted by grade stored in sortedStudentList
        QuickSortStudentArr.quickSortStudentArr(studentArr, 0, studentArr.size() - 1);


        //Add grade-sorted ArrayList<Student> to a new CSV file
        try (BufferedWriter studentMasterListSorted = new BufferedWriter(
                     new FileWriter("src/student_lists/student-master-list-sorted.csv"))) {

            for(Student student : studentArr){
                studentMasterListSorted.write(
                        student.studentID + "," +
                        student.studentName + "," +
                        student.courseName + "," +
                        student.grade + "\n");
            }

//            while ((line = fileReader.readLine()) != null) {
//                studentArr.add(line);
////                lineData = line.split(",");
        }
    }
}

