package QuestionAnswer;

public class Questions {
	private String questionText;
    private String correctAnswer;

    public Questions(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isCorrect(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer.trim());
    }
}

