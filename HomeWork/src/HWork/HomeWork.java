package HWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {"В файл с каким расширением компилируется java-файл?\n" +
                "1. cs\n2. java\n3. rar\n4. class\n5. exe",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?\n" +
                        "1. commit\n2. push\n3. clone\n4. copy",
                "Какой применяется цикл, когда не известно количество итераций?\n" +
                        "1. while\n2. for\n3. loop"};
        int[] answers = {4, 3, 1};
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int answer = sc.nextInt();
            if (answer == answers[i]) {
                rightAnswersCount++;
            } else {
                wrongAnswersCount++;
            }
        }
        System.out.println("Результат: " + "правильно " + rightAnswersCount + " неправильно " + wrongAnswersCount);
    }
}