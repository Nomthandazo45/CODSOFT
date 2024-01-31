import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Question {
    private String question;
    private List<String> options;
    private int correctAnswer;

    public Question(String question, List<String> options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    //Getters and setters
}
List<Question> quizQuestions = new ArrayList<>();
quizQuestions.add(new Question("What is the capital of South Africa?", Arrays.asList("A. Johannesburg", "B. Pretoria", "C. Durban", "D. Port Elizabeth"), 1));
quizQuestions.add(new Question("How many continents are on Earth?", Arrays.asList("A. Ten", "B. Seven", "C. Eleven", "D. Eight"), 2));
quizQuestions.add(new Question("Which ocean is south of Asia?", Arrays.asList("A. Pacific", "B. Atlantic", "C. Indian", "D. Arctic"), 3));
quizQuestions.add(new Question("What is the world's most popular social media platform?", Arrays.asList("A. Instagram", "B. Facebook", "C. Tik Tok", "D. Twitter"), 4));
quizQuestions.add(new Question("What is the world's most popular programming language?", Arrays.asList("A. Python", "B. SQL", "C. JavaScript", "D. HTML/CSS"), 5));
// questions

public class QuizTimer {
    private Timer timer;
    private int timeLimit;

    public QuizTimer(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void startTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            int seconds = timeLimit;

            @Override
            public void run() {
                if (seconds > 0) {
                    System.out.println("Time remaining: " + seconds + " seconds");
                    seconds--;
                } else {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }
        }, 0, 1000); // Run the task every second
    }

    public void stopTimer() {
        timer.cancel();
    }
}
public class QuizApp {
    public static void main(String[] args) {
        List<Question> quizQuestions = new ArrayList<>();
        //Adding questions to the quiz questions list
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for (Question question : quizQuestions) {
            System.out.println(question.getQuestion());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }
            System.out.print("Enter your answer: ");
            int userAnswer = scanner.nextInt();

            // Check if the user's answer is correct and update the score
            if (userAnswer == question.getCorrectAnswer()) {
                score++;
                //Update the score
            }
        }

        scanner.close();

        System.out.println("Your score: " + score);
    }
}
