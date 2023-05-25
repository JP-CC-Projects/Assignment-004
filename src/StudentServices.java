import java.io.*;

public class StudentServices {
    public StudentServices() throws Exception {

        String line = null;
        String[] lineData = {};


        //Read sorted student master list &
        //Create and write grade-sorted course CSVs:

        try (BufferedReader fileReader = new BufferedReader(
                new FileReader("src/student_lists/student-master-list-sorted.csv"));
             BufferedWriter courseListAPMTH = new BufferedWriter(new FileWriter("src/student_lists/course1.csv"));
             BufferedWriter courseListCOMPSCI = new BufferedWriter(new FileWriter("src/student_lists/course2.csv"));
             BufferedWriter courseListSTAT = new BufferedWriter(new FileWriter("src/student_lists/course3.csv"))) {


//            Write category headers for each course list:
            courseListAPMTH.write("Student ID,Student Name,Course,Grade");
            courseListAPMTH.newLine();
            courseListCOMPSCI.write("Student ID,Student Name,Course,Grade");
            courseListCOMPSCI.newLine();
            courseListSTAT.write("Student ID,Student Name,Course,Grade");
            courseListSTAT.newLine();

//            Add students to appropriate courses via regex match
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
