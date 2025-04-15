package QuestionAnswer;

public class mainqz {
	public static void main(String[] args) {
		QnA QnA = new QnA();

         QnA.add(new Questions("What is the chemical symbol for water?", "h2o"));
         QnA.add(new Questions("Which planet is known as the Red Planet?", "mars"));
         QnA.add(new Questions("Who wrote 'Hamlet'?", "shakespeare"));
         QnA.add(new Questions("What is 12 multiplied by 8?", "96"));
         QnA.add(new Questions("Which continent is Egypt located in?", "africa"));

        QnA.giveQuiz();
    }
}


