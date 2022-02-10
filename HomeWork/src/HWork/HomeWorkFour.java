package HWork;

import java.util.Scanner;
public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Answers ans = new Answers();
        Questions que = new Questions();
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        for (int i = 0; i < que.questions.length; i++) {
            System.out.println(que.questions[i]);
            int answer = sc.nextInt();
            if (answer == ans.answers[i]) {
                rightAnswersCount++;
            } else {
                wrongAnswersCount++;
            }
        }
        System.out.println("Результат: " + "правильно " + rightAnswersCount + " неправильно " + wrongAnswersCount);

    }
}