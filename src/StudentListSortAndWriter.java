import java.io.*;
import java.util.Arrays;

public class StudentListSortAndWriter {
    public StudentListSortAndWriter(FileOutputStream[] studentListObjectArr) throws IOException {
        int i = 0;
        final String line = "hello";


        try (ObjectOutputStream objectOutput = new ObjectOutputStream(studentListObjectArr[0])) {
            objectOutput.writeObject(line);
        }

//        try(BufferedReader fileReader = new FileReader()){
//            while((line = fileReader.readLine()) != null){
//            }
//        };
    }
}
