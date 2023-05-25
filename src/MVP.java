import java.io.*;

public class MVP {
    public MVP() throws Exception {

        String line = null;
        String[] lineData = {};

        try (BufferedReader fileReader = new BufferedReader(
                new FileReader("src/student_lists/student-master-list-sorted.csv"));
             BufferedWriter courseListAPMTH = new BufferedWriter(new FileWriter("src/student_lists/course1.txt"));
             BufferedWriter courseListCOMPSCI = new BufferedWriter(new FileWriter("src/student_lists/course2.txt"));
             BufferedWriter courseListSTAT = new BufferedWriter(new FileWriter("src/student_lists/course3.txt"))) {


//            Write category headers for each course list:
            courseListAPMTH.write("Student ID,Student Name,Course,Grade");
            courseListAPMTH.newLine();
            courseListCOMPSCI.write("Student ID,Student Name,Course,Grade");
            courseListCOMPSCI.newLine();
            courseListSTAT.write("Student ID,Student Name,Course,Grade");
            courseListSTAT.newLine();


            while ((line = fileReader.readLine()) != null) {
                lineData = line.split(",");

                if (lineData[2].matches("^APMTH.*$")) {
                    courseListAPMTH.write(line);
                    courseListAPMTH.newLine();
                } else if (lineData[2].matches("^COMP.*$")) {
                    courseListCOMPSCI.write(line);
                    courseListCOMPSCI.newLine();
                } else if (lineData[2].matches("^STAT.*$")) {
                    courseListSTAT.write(line);
                    courseListSTAT.newLine();

                }
            }
        }
    }
}
