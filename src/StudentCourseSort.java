import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentCourseSort {
    public String[] studentCourseSort() {

        int i = 0;
        String line = null;
        List<String> lines = new ArrayList<>();
        String[] lineData = {};
        BufferedReader fileReader = null;

        try{
            fileReader = new BufferedReader(new FileReader("src/student_lists/student-master-list.csv"));

            while((line = fileReader.readLine()) != null){
                lineData = line.split(",");

                if(lineData[2].matches("^APMTH.*$")){
                    new APMTHStudentListMaker(line);
                }
                else if(lineData[2].matches("^COMP.*$")){

                }
                else if(lineData[2].matches("^STAT.*$")){

                }
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
        finally{
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return new String[]{};
    }
}
