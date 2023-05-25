import java.util.ArrayList;
import java.util.Random;

public class QuickSortStudentArr2 {


    private static void quickSortStudentArr2(ArrayList<Student> studentArr){
        quickSortStudentArr2(studentArr, 0, studentArr.size()-1);
    }

    private static void quickSortStudentArr2(ArrayList<Student> studentArr, int lowIndex, int highIndex)
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
        int pivotIndex = new Random().nextInt(highIndex-lowIndex) + lowIndex;
        int pivot = Integer.parseInt(studentArr.get(pivotIndex).grade);
        quickSwap(studentArr, pivotIndex, highIndex);

        int leftPointer = partition(studentArr, lowIndex, highIndex, pivot);
        quickSortStudentArr2(studentArr, lowIndex, leftPointer - 1);
        quickSortStudentArr2(studentArr, leftPointer + 1, highIndex);
    }


    private static int partition(ArrayList<Student> studentArr, int lowIndex, int highIndex, int pivot) {
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
        return leftPointer;
    }

    private static void quickSwap(ArrayList<Student> arr, int index1, int index2) {
        Student temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }
}
