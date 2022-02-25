package HWork;

import java.util.Scanner;

public class User {

    private String name;
    private int rightAnswersCount;
    private int wrongAnswersCount;
    private int answersCount;

    public int getAnswersCount() {
        return answersCount;
    }


    public void setAnswersCount(int answersCount) {
        this.answersCount = answersCount;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.length() < 1) {
            System.out.println("Name is not valid");
            return;
        }
        System.out.println("Hello: " + name);
        this.name = name;
    }

    public int getWrongAnswersCount() {
        return wrongAnswersCount;
    }

    public void setWrongAnswersCount(int wrongAnswersCount) {
        this.wrongAnswersCount = wrongAnswersCount;
    }

    public int getRightAnswersCount() {
        return rightAnswersCount;
    }

    public void addWrongAnswer() {
        this.wrongAnswersCount++;
    }

    public void addRightAnswer() {
        this.rightAnswersCount++;
    }



}
