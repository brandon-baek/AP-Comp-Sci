public class RunningAverage {
    private int count;
    private double average;

    public RunningAverage() {
        count = 0;
        average = 0.0;
    }

    public void updateAverage(double newVal) {
        count++;
        average += (newVal - average) / count;
    }

    public int processNewRatings(int num) {
        int invalidCount = 0;
        for (int i = 0; i < num; i++) {
            double rating = getNewRating();
            if (rating >= 0) {
                updateAverage(rating);
            } else {
                invalidCount++;
            }
        }
        return invalidCount;
    }

    public double getNewRating() {
        // Implementation not shown
    }
}