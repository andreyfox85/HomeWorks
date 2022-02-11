package HWork;

import java.util.Scanner;
public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Answer ans = new Answer();
        Question que = new Question();
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        for (int i = 0; i < que.getQuestions().length; i++) {
            System.out.println(que.getQuestions()[i]);
            int answer = sc.nextInt();
            if (answer == ans.getAnswers()[i]) {
                rightAnswersCount++;
            } else {
                wrongAnswersCount++;
            }
        }
        System.out.println("Результат: " + "правильно " + rightAnswersCount + " неправильно " + wrongAnswersCount);

    }
}