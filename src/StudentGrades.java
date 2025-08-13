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
                throw new IllegalArgumentException("Some score in the array <0.");
            }
            //If any score in the array >10
            if (scores[i] < 0) {
                throw new IllegalArgumentException("Some score in the array >10.");
            }
        }

        //calculation

        double avg, sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum += sum;
        }
        avg = sum/ scores.length;
        return avg;
    }

}
