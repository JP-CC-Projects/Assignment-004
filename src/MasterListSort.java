import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MasterListSort {

    public MasterListSort() throws Exception {
        String line = null;
        String[] lineData = {};

        ArrayList<String[]> studentArr = new ArrayList<>();

        HashMap<String[], Integer> map = new HashMap();


        try (BufferedReader fileReader = new BufferedReader(
                new FileReader("src/student_lists/student-master-list.csv"))){

             while ((line = fileReader.readLine()) != null) {
                 lineData = line.split(",");
                 studentArr.add(lineData);
            }
        }
        System.out.println(studentArr.get(1));
        System.out.println(studentArr.get(3));






        try (BufferedReader fileReader = new BufferedReader(
                new FileReader("src/student_lists/student-master-list.csv"));
             BufferedWriter studentMasterListSorted = new BufferedWriter(
                new FileWriter("src/student_lists/student-master-list-sorted.txt"))) {

            while ((line = fileReader.readLine()) != null) {
//                studentArr.add(line);
//                lineData = line.split(",");
            }
        }
    }
}
