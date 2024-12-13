import java.util.Scanner;

class lab17 {
    public static int askQuestion(String question, String option1, String option2, String option3, int correctAnswer, Scanner sc) {
        System.out.println(question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        int userAnswer = sc.nextInt();
        
        if (userAnswer == correctAnswer) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void displayScore(int score, int totalQuestions) {
        System.out.println("\nThank you for taking the quiz!");
        System.out.println("You scored " + score + " out of " + totalQuestions);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 10;

        System.out.println("--- AI Quiz ---\n");

        // Question 1
        score += askQuestion("What is an Epoch?",
                "The number of times a model is trained on a dataset", "Strength of model", "The rate at which model trains on a dataset",
                1, sc);

        // Question 2
        score += askQuestion("What does a high learning rate lead to?",
                "A perfect model", "Slower convergence and underfitting", "Faster convergence but possible overshooting",
                3, sc);

        // Question 3
        score += askQuestion("Which of the following is a type of neural network?",
                "Generative Adversarial Model (GAM)", "Convolutional Neural Network (CNN)", "Bayesian Network",
                2, sc);

        // Question 4
        score += askQuestion("What is overfitting in a model?",
                "When a model performs poorly on training data but well on new data", "When a model performs equally well on training and new data", "When a model performs well on training data but poorly on new data",
                3, sc);

        // Question 5
        score += askQuestion("What is backpropagation?",
                "A technique to initialize weights", "A method to adjust weights by propagating the error backwards", "A method to increase the size of the dataset",
                2, sc);

        // Question 6
        score += askQuestion("Which of these is used for classification tasks?",
                "Logistic Regression", "K-Means Clustering", "Linear Regression",
                1, sc);

        // Question 7
        score += askQuestion("What is the vanishing gradient problem?",
                "Gradients become too large, causing instability", "Gradients become too small, slowing down learning", "Gradients disappear after a certain number of epochs",
                2, sc);

        // Question 8
        score += askQuestion("What does 'dropout' refer to in neural networks?",
                "Stopping the training process prematurely", "Removing low-importance features from the dataset", "Randomly turning off neurons during training",
                3, sc);

        // Question 9
        score += askQuestion("Which optimizer is commonly used in deep learning?",
                "Adam", "Newton's Method", "Stochastic Gradient Descent (SGD)",
                1, sc);

        // Question 10
        score += askQuestion("What is regularization?",
                "A process to clean the dataset", "A technique to prevent overfitting by adding a penalty term to the loss function", "A method to train a model faster",
                2, sc);

        displayScore(score, totalQuestions);
    }
}