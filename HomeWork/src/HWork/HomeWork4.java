package HWork;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Answer answer1 = new Answer(4);
        Question question1 = new Question("В файл с каким расширением компилируется java-файл?\n" +
                "1. cs\n2. java\n3. rar\n4. class\n5. exe", answer1);
        Answer answer2 = new Answer(3);
        Question question2 = new Question("С помощью какой команды git можно получить полную копию удаленного репозитория?\n" +
                "1. commit\n2. push\n3. clone\n4. copy", answer2);
        Answer answer3 = new Answer(1);
        Question question3 = new Question("Какой применяется цикл, когда не известно количество итераций?\n" +
                "1. while\n2. for\n3. loop", answer3);

        int[] answers = {4, 3, 1};
        Question[] questions = {question1, question2, question3};

        User user = new User();
        System.out.println("Enter you name");
        user.setName();

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            int answer = sc.nextInt();
            if (answer == answers[i]) {
                user.addRightAnswer();
                System.out.println("Правильно");
            } else {
                user.addWrongAnswer();
                System.out.println("Неправильно");
            }

        }

        System.out.println("Результат: " + "правильно " + user.getRightAnswersCount() + " неправильно " + user.getWrongAnswersCount());
    }
}