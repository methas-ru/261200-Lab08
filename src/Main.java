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
            System.out.println("Enter a series of scores (comma-separated):");
            String score_String = scanner.nextLine();

            //process

            //split
            String[] score_Arr_String = score_String.split(",");
            //parseInt
            int[] score_Arr_Int = new int[score_Arr_String.length];
            for (int i = 0; i < score_Arr_String.length; i++) {
                score_Arr_Int[i] = Integer.parseInt(score_Arr_String[i]);
            }

            double studentGrade_Avg = studentGrades.calculateAverage(score_Arr_Int);
            System.out.println(studentGrade_Avg);
        }
        catch ( NumberFormatException e ) {
            System.out.println("The user enters non-numeric input." +
                    "\nErrorMessage: " + e.getMessage());
        }
        catch ( IllegalArgumentException e ) {
            System.out.println("ErrorMessage: " + e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println( "Grade calculation process concluded.");
        }

    }

}