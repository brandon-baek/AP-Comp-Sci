public class StepTracker {
    // Simple variable names that clearly show what they store
    private int requiredSteps;
    private int totalSteps;
    private int numActiveDays;
    private int numDays;
    
    // Simple constructor
    public StepTracker(int steps) {
        requiredSteps = steps;
        totalSteps = 0;
        numActiveDays = 0;
        numDays = 0;
    }
    
    // Add steps for one day
    public void addDailySteps(int steps) {
        // Add to total steps
        totalSteps = totalSteps + steps;
        
        // Count one more day
        numDays = numDays + 1;
        
        // Check if it's an active day
        if (steps >= requiredSteps) {
            numActiveDays = numActiveDays + 1;
        }
    }
    
    // Get number of active days
    public int activeDays() {
        return numActiveDays;
    }
    
    // Calculate average steps
    public double averageSteps() {
        // If no days recorded, return 0.0
        if (numDays == 0) {
            return 0.0;
        }
        
        // Calculate average by dividing total steps by number of days
        double average = (double) totalSteps / numDays;
        return average;
    }
}