import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentListSortAndWriter {
    public String[] studentListSortAndWriter() {

        int i = 0;
        String line = null;
        List<String> lines = new ArrayList<>();
        String[] lineData = {};
        BufferedReader fileReader = null;

        try{
            fileReader = new BufferedReader(new FileReader("src/student_lists/student-master-list.csv"));

            while((line = fileReader.readLine()) != null){
                lineData = line.split(",");
                lines = Arrays.asList(lineData);
                System.out.println(Arrays.toString(lineData));
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
