public class StudentGrades {

    //calculates the average of an array of integer scores.
    public double calculateAverage(int[] scores){

        //validation

        //If the scores array is null.
        if (scores == null) {
            throw new IllegalArgumentException("The scores array is null.");
        }
        //If the scores array is empty.
        if (scores.length == 0) {
            throw new IllegalArgumentException("The scores array is empty.");
        }
        //If any score in the array <0 or >100.
        for (int i = 0; i < scores.length; i++) {
            //If any score in the array <0
            if (scores[i] < 0) {
                throw new IllegalArgumentException("Score cannot be less than 0.");
            }
            //If any score in the array >100
            if (scores[i] > 100) {
                throw new IllegalArgumentException("Score cannot be greater than 100.");
            }
        }

        //calculation

        double avg, sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = sum/ scores.length;

        // if the average < 40
        if (avg < 40) {
            throw new FailedSignificantlyException("Student average is " + avg + ", which is a significant failure.");
        }

        return avg;
    }

}
