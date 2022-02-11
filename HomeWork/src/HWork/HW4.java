package HWork;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        Answer answer = new Answer();
        Question question = new Question();
        System.out.println("Enter you name");
        user.setName();

        question.setQuestions(question.getQuestions());
        answer.setAnswers(sc.nextInt());
        user.setRightAnswersCount();
        user.getWrongAnswersCount();
        System.out.println("Результат: " + "правильно "  + " неправильно " );

    }
}

class User {
    Scanner sc = new Scanner(System.in);
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
    public void setRightAnswersCount() {
        if (rightAnswersCount < 0) {
            System.out.println("Right answer count can not be < 0");
            return;
        }
        this.rightAnswersCount = rightAnswersCount;
    }
}

class Question {

        private String[] questions = {"В файл с каким расширением компилируется java-файл?\n" +
                "1. cs\n2. java\n3. rar\n4. class\n5. exe",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?\n" +
                        "1. commit\n2. push\n3. clone\n4. copy",
                "Какой применяется цикл, когда не известно количество итераций?\n" +
                        "1. while\n2. for\n3. loop"};

        public Question() {
        }

        public String[] getQuestions() {
            return questions;
        }

        public void setQuestions(String[] questions) {
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
            }
            this.questions = questions;
        }
    }
class Answer {
        private int[] answers = {4, 3, 1};
        Scanner sc = new Scanner(System.in);
        int rightAnswersCount =0;
        int wrongAnswersCount =0;
        public int[] getAnswers() {
            return answers;
        }

        public void setAnswers(int[] answers) {
            for (int i = 0; i < answers.length; i++) {
                System.out.println(answers[i]);
                int answer = sc.nextInt();
                if (answer == answers[i]) {
                    rightAnswersCount++;
                } else {
                    wrongAnswersCount++;
                }
            }
            this.answers = answers;
        }

        public Answer() {
            this.answers = answers;
        }

        public void setAnswers(int nextInt) {
        }
    }
