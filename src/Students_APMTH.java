import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Students_APMTH extends Student{
    public Students_APMTH() throws Exception {
        String line = null;
        String[] lineData = {};
        ArrayList<String[]> apmthStudentArr = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(
                new FileReader("src/student_lists/course1.txt"))){
            while ((line = fileReader.readLine()) != null) {
                lineData = line.split(",");
                apmthStudentArr.add(lineData);
            }
        }
    }
}
