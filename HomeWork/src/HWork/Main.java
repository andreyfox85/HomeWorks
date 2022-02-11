package HWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.setName("Enter your name");

        System.out.println(user.getName());
        user.setRightAnswersCount();
        user.getWrongAnswersCount();
        System.out.println();
    }
}
