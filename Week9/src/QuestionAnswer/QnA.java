package QuestionAnswer;
import java.util.Scanner;

public class QnA {
	  private Questions[] questions;
	    private int count;

	    public QnA() {
	        questions = new Questions[25];
	        count = 0;
	    }

	    public void add(Questions q) {
	        if (count < questions.length) {
	            questions[count++] = q;
	        } else {
	            System.out.println("Quiz is full.");
	        }
	    }

	    public void giveQuiz() {
	        Scanner scanner = new Scanner(System.in);
	        int score = 0;

	        for (int i = 0; i < count; i++) {
	            System.out.println("Q" + (i + 1) + ": " + questions[i].getQuestionText());
	            String userAnswer = scanner.nextLine();
	            if (questions[i].isCorrect(userAnswer)) {
	                score++;
	            }
	        }

	        System.out.println("\nQuiz Complete!");
	        System.out.println("Score: " + score + " out of " + count);
	        scanner.close();
	    }
	}


