import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Student Name: ");
        String name = in.nextLine();

        System.out.print("Enter the Student ID: ");
        int id = in.nextInt();

        System.out.print("Enter the Number of Subjects: ");
        int subjects = in.nextInt();

        double[] grades = new double[subjects];
        System.out.print("Enter the Grades: ");
        for (int i = 0; i < subjects; i++) {
            grades[i] = in.nextDouble();

        }

    }

}