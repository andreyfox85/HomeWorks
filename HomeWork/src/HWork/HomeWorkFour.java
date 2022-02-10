package HWork;

import java.util.Scanner;
public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Answers answers = new Answers();
        Questions questions = new Questions();
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
    }
}