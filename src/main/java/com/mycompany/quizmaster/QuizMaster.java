package com.mycompany.quizmaster;
import java.util.Scanner;
public class QuizMaster {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner scanner = new Scanner(System.in);
        
        String[] choices1 = {"Ariel", "Cinderella", "Belle", "Rapunzel"};

        MultipleChoiceQuestion question1 =
                new MultipleChoiceQuestion(
                        "Which Disney princess has a chameleon named Pascal?",
                        "Rapunzel",
                        choices1
                );

        quiz.addQuestion(question1);
        String[] choices2 = {"Simba", "Nala", "Mufasa", "Scar"};

MultipleChoiceQuestion question2 =
        new MultipleChoiceQuestion(
                "Who is Simba's father in The Lion King?",
                "Mufasa",
                choices2
        );

quiz.addQuestion(question2);
TrueFalseQuestion question3 =
        new TrueFalseQuestion(
                "Elsa is Anna's older sister in Frozen.",
                "True"
        );

quiz.addQuestion(question3);

System.out.println("Welcome to the Disney Quiz!");
System.out.println(quiz.getCurrentQuestion().getQuestionText());
String answer = scanner.nextLine();

if (quiz.submitAnswer(answer)) {
    System.out.println("Correct!");
} else {
    System.out.println("Incorrect!");
}
quiz.nextQuestion();
System.out.println(quiz.getCurrentQuestion().getQuestionText());
answer = scanner.nextLine();

if (quiz.submitAnswer(answer)) {
    System.out.println("Correct!");
} else {
    System.out.println("Incorrect!");
}
quiz.nextQuestion();
System.out.println(quiz.getCurrentQuestion().getQuestionText());
answer = scanner.nextLine();

if (quiz.submitAnswer(answer)) {
    System.out.println("Correct!");
} else {
    System.out.println("Incorrect!");
}
System.out.println("Your final score is: " + quiz.getScore() + "/3");
    }
}