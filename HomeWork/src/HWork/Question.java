package HWork;

public class Question {
    private String description;
    private Answer answer;

    public String getDescription() {
        return description;
    }

    public Question(String description, Answer answer) {
        this.answer = answer;
        this.description = description;
    }

    public Answer getAnswer() {
        return this.answer;
    }

    @Override
    public String toString() {
        return description;
    }
}
