package main.java.bunlde;


import main.java.bunlde.exception.NoSuchQuestionException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose language:\n" +
                "en - for english\n" +
                "ru - для использования русского языка\n");
        QuestionsBundle list = new QuestionsBundle(in.next());
        System.out.println(list.printQuestions());
        System.out.println(list.makeChoice());
        int choice = in.nextInt();
        while (choice!= 0) {
            try {
                System.out.println(list.getAnswer(choice));
                System.out.println(list.continueChoice());
                choice = in.nextInt();
                if (choice == 0){
                    break;
                }
                System.out.println(list.printQuestions());
                System.out.println(list.makeChoice());
                choice = in.nextInt();
            } catch (NoSuchQuestionException e) {
                System.out.println(list.makeChoice());
                choice = in.nextInt();
            }

        }
    }
}
