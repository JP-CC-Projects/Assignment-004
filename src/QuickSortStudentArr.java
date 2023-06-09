import java.text.NumberFormat;
import java.util.ArrayList;

public class QuickSortStudentArr {

    public static void quickSortStudentArr(ArrayList<Student> studentArr){
        quickSortStudentArr(studentArr, 0, studentArr.size()-1);
    }
    public static void quickSortStudentArr(ArrayList<Student> studentArr, int lowIndex, int highIndex)
            throws NumberFormatException {


//        Catch block for  NumberFormatException:
        try {
            for (Student s : studentArr) {
                int i = Integer.parseInt(s.grade);
            }
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception Found");
            System.out.println(e);
        }

//        Quick sort algorithm:

        if (lowIndex >= highIndex) return;
        int pivot = Integer.parseInt(studentArr.get(highIndex).grade);
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer &&
                    Integer.parseInt(studentArr.get(leftPointer).grade) >= pivot) {
                leftPointer++;
            }
            while (rightPointer > leftPointer &&
                    Integer.parseInt(studentArr.get(rightPointer).grade) <= pivot) {
                rightPointer--;
            }
            quickSwap(studentArr, leftPointer, rightPointer);
        }
        quickSwap(studentArr, leftPointer, highIndex);

        quickSortStudentArr(studentArr, lowIndex, leftPointer - 1);
        quickSortStudentArr(studentArr, leftPointer + 1, highIndex);
    }


    private static void quickSwap(ArrayList<Student> arr, int index1, int index2) {
        Student temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }
}
