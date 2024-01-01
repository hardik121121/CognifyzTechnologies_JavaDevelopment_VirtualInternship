 import java.util.*;
public class Task_3_StudentGradeCalculator{   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = sc.nextInt();

        
        if (numberOfGrades <= 0) {
            System.out.println("Please enter a valid number of grades.");
            return;
        }

        
        int totalGrades = 0;

        
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            int grade = sc.nextInt();

            
            if (grade < 0 || grade > 100) {
                System.out.println("Please enter a valid grade (0-100).");
                return;
            }

            totalGrades += grade;
        }

        
        double averageGrade = (double) totalGrades / numberOfGrades;

        System.out.println("Average Grade: " + averageGrade);

        
        sc.close();

    }
}