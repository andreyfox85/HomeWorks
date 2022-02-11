package HWork;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        Question question = new Question();
        System.out.println("Enter you name");
        user.setName();
        question.setQuestions(question.getQuestions());

        user.setRightAnswersCount();
        user.getWrongAnswersCount();
        System.out.println();
    }
}

class Question {

    private String[] questions = {"В файл с каким расширением компилируется java-файл?\n" +
            "1. cs\n2. java\n3. rar\n4. class\n5. exe",
            "С помощью какой команды git можно получить полную копию удаленного репозитория?\n" +
                    "1. commit\n2. push\n3. clone\n4. copy",
            "Какой применяется цикл, когда не известно количество итераций?\n" +
                    "1. while\n2. for\n3. loop"};

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
        }
        this.questions = questions;
    }

    public Question() {
        this.questions = questions;
    }
}

class User {
    Scanner sc = new Scanner(System.in);
    private String name;

    private int rightAnswersCount;
    private int wrongAnswersCount;

    public User() {

    }

    public int getWrongAnswersCount() {
        return wrongAnswersCount;
    }

    public void setWrongAnswersCount(int wrongAnswersCount) {
        this.wrongAnswersCount = wrongAnswersCount;
    }

    public User(int wrongAnswersCount) {
        this.wrongAnswersCount = wrongAnswersCount;
    }

    public int getRightAnswersCount() {
        return rightAnswersCount;
    }

    public void setRightAnswersCount() {
        if (rightAnswersCount < 0) {
            System.out.println("Right answer count can not be < 0");
            return;
        }
        this.rightAnswersCount = rightAnswersCount;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        String name = sc.nextLine();
        if (name.length() < 1) {
            System.out.println("Name is not valid");
            return;
        }
        System.out.println("Hello: " + name);
        this.name = name;
    }
}

class Answer {
    private int[] answers = {4, 3, 1};

    public int[] getAnswers() {
        return answers;
    }

    public void setAnswers(int[] answers) {
        this.answers = answers;
    }

    public Answer() {
        this.answers = answers;
    }
}
