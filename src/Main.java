
public class Main {

    public static void main(String[] args) {

        int[][] STUDENT_MARKS = {

                {80, 85, 100, 95},
                {44, 38, 40, 35}

        };

        int studentId = 1;

        for (int[] mark : STUDENT_MARKS) {

            displayStudentDetails(getAverageMarks(mark), studentId);

            studentId++;

        }

    }


    public static double getAverageMarks(int[] marks) {

        double averageMark = 0;

        for (int mark : marks) {
            averageMark += mark;
        }

        return averageMark / marks.length;

    }

    public static void displayStudentDetails(double average, int studentId) {


        System.out.println("Student " + studentId + " average Mark is " + average);

        if (average >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println();

    }


}
