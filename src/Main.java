//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //setup
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();

        try {
            //input
            System.out.println("Enter scores (comma-separated): ");
            String score_String = scanner.nextLine();

            //process

            //Scores array cannot be empty.
            if (score_String.isBlank()){
                throw new IllegalArgumentException("Scores array cannot be empty.");
            }

            //split
            String[] score_Arr_String = score_String.split(",");
            //parseInt
            int[] score_Arr_Int = new int[score_Arr_String.length];
            for (int i = 0; i < score_Arr_String.length; i++) {
                score_Arr_Int[i] = Integer.parseInt(score_Arr_String[i]);
            }

            double studentGrade_Avg = studentGrades.calculateAverage(score_Arr_Int);
            System.out.println("Average score: " + studentGrade_Avg);
        }
        catch ( NumberFormatException e ) {
            System.out.println("Invalid input: Please enter a valid number for scores. " + e.getMessage());
        }
        catch ( IllegalArgumentException e ) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (FailedSignificantlyException e) {
            System.out.println("Significant Failure: " + e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println( "Grade calculation process concluded.");
        }

    }

}