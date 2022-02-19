package HWork;

public class Question {
    private String description;
    private Answer answer;


    public Question(String description, Answer answer) {
        this.answer = answer;
        this.description = description;
    }

    public Answer getAnswer() {
        return this.answer;
    }
}
