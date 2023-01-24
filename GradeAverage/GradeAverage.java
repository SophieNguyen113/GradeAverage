import java.util.Scanner;
/**
  * Programming Project 2
  * This program completes a grade average program.
  * @author Sophie Nguyen
  * @version 03/09/2022
  */

public class GradeAverage
{
   public static void main(String[] args)
   {
      final double TEST_WEIGHT = 0.40;          // Constant for a test weight of 40% 
      final double MIDTERM_EXAM_WEIGHT = 0.25;  // Constant for a midterm exam weight of 25% 
      final double FINAL_EXAM_WEIGHT = 0.35;    // Constant for a final exam weight of 35%
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter Test score #1: ");       // Enter test score #1
      Double testScore1 = in.nextDouble();
      System.out.print("Enter Test score #2: ");       // Enter test score #2
      Double testScore2 = in.nextDouble();
      System.out.print("Enter Test score #3: ");       // Enter test score #3
      Double testScore3 = in.nextDouble();
      System.out.print("Enter Midterm exam score: ");  // Enter midterm exam score 
      Double midTerm = in.nextDouble();
      System.out.print("Enter Final exam score: ");    // Enter final exam score 
      Double finalScore = in.nextDouble();
      
      System.out.printf("\n"); // Insert a newline
    
      double testAverage = (testScore1 + testScore2 + testScore3) / 3 * TEST_WEIGHT;                       // Find test average
      double gradeAverage = testAverage + midTerm * MIDTERM_EXAM_WEIGHT + finalScore * FINAL_EXAM_WEIGHT;  // Find grade average
      System.out.printf("Grade Average: %.2f \n", gradeAverage);    // Display 2 decimal places and then insert a newline

      char letterGrade;
      if (gradeAverage >= 90 && gradeAverage <= 100)
         { 
            letterGrade = 'A';
         }
      else if (gradeAverage >= 80 && gradeAverage <= 89)
         { 
            letterGrade = 'B';
         }
      else if (gradeAverage >= 70 && gradeAverage <= 79)
         { 
            letterGrade = 'C';
         }
      else if (gradeAverage >= 60 && gradeAverage <= 69)
         { 
            letterGrade = 'D';
         }
      else // (gradeAverage >= 0 && gradeAverage <= 59)
         { 
            letterGrade = 'F';
         }
      System.out.println("Letter grade:  " + letterGrade);
      
      if (letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C') // Passing
         {
            System.out.println("Good job. You met the prerequisite for the next course.");
         }
      else // Not passing, (letterGrade == 'D' || letterGrade == 'F')
         {
            System.out.println("I'm sorry. You will have to repeat the course before advancing.");
         }       
   }
}