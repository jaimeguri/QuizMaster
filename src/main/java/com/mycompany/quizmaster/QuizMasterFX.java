/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizmaster;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class QuizMasterFX extends Application {
    
    private Quiz quiz;
    
@Override
public void start(Stage stage) {

    quiz = new Quiz();

quiz.addQuestion(new MultipleChoiceQuestion(
        "Which Disney princess has a chameleon named Pascal?",
        "Rapunzel",
        new String[]{"Rapunzel", "Ariel", "Belle", "Cinderella"}
));

quiz.addQuestion(new MultipleChoiceQuestion(
        "What is the name of Simba's father?",
        "Mufasa",
        new String[]{"Scar", "Timon", "Mufasa", "Rafiki"}
));

quiz.addQuestion(new MultipleChoiceQuestion(
        "What is the name of the snowman in Frozen?",
        "Olaf",
        new String[]{"Sven", "Olaf", "Kristoff", "Hans"}
));

quiz.addQuestion(new MultipleChoiceQuestion(
        "In The Little Mermaid, what is Ariel's best friend's name?",
        "Flounder",
        new String[]{"Sebastian", "Scuttle", "Flounder", "Eric"}
));

quiz.addQuestion(new MultipleChoiceQuestion(
        "What type of animal is Pumbaa in The Lion King?",
        "Warthog",
        new String[]{"Meerkat", "Warthog", "Hyena", "Lion"}
));

quiz.addQuestion(new TrueFalseQuestion(
        "Mickey Mouse is a Disney character.",
        "True"
));

quiz.addQuestion(new TrueFalseQuestion(
        "In Tangled, Flynn Rider's real name is Eugene Fitzherbert.",
        "True"
));

quiz.addQuestion(new TrueFalseQuestion(
        "In Finding Nemo, Dory is a clownfish.",
        "False"
));

quiz.addQuestion(new MultipleChoiceQuestion(
        "What is the name of Mulan's dragon companion?",
        "Mushu",
        new String[]{"Khan", "Mushu", "Cri-Kee", "Shang"}
));

quiz.addQuestion(new TrueFalseQuestion(
        "In Beauty and the Beast, Lumiere is a candlestick.",
        "True"
));

    Label titleLabel = new Label("✨ Disney Quiz ✨");
titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

Label progressLabel = new Label("Question 1 of 10");
progressLabel.setStyle("-fx-font-size: 13px; -fx-text-fill: #A66A7A;");

Question currentQuestion = quiz.getCurrentQuestion();

Label questionLabel = new Label(currentQuestion.getQuestionText());
questionLabel.setStyle("-fx-font-size: 16px;");

MultipleChoiceQuestion mcQuestion = (MultipleChoiceQuestion) currentQuestion;
String[] choices = mcQuestion.getChoices();

RadioButton answer1 = new RadioButton(choices[0]);
RadioButton answer2 = new RadioButton(choices[1]);
RadioButton answer3 = new RadioButton(choices[2]);
RadioButton answer4 = new RadioButton(choices[3]);

answer1.setStyle("-fx-font-size: 14px; -fx-text-fill: #5A3A45;");
answer2.setStyle("-fx-font-size: 14px; -fx-text-fill: #5A3A45;");
answer3.setStyle("-fx-font-size: 14px; -fx-text-fill: #5A3A45;");
answer4.setStyle("-fx-font-size: 14px; -fx-text-fill: #5A3A45;");

ToggleGroup answers = new ToggleGroup();

answer1.setToggleGroup(answers);
answer2.setToggleGroup(answers);
answer3.setToggleGroup(answers);
answer4.setToggleGroup(answers);

Button submitButton = new Button("Submit Answer");
submitButton.setPrefWidth(130);
submitButton.setStyle("-fx-background-color: #FFB6C1; -fx-text-fill: #5A3A45; -fx-font-weight: bold; -fx-background-radius: 15;");

Label resultLabel = new Label("");
resultLabel.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");

Button nextButton = new Button("Next Question");
nextButton.setPrefWidth(130);
nextButton.setStyle("-fx-background-color: #FFB6C1; -fx-text-fill: #5A3A45; -fx-font-weight: bold; -fx-background-radius: 15;");

Button restartButton = new Button("Restart Quiz");
restartButton.setPrefWidth(130);
restartButton.setStyle("-fx-background-color: #FFB6C1; -fx-text-fill: #5A3A45; -fx-font-weight: bold; -fx-background-radius: 15;");

restartButton.setOnAction(e -> {
    quiz.resetQuiz();
    progressLabel.setText("Question 1 of " + quiz.getTotalQuestions());

    questionLabel.setText(quiz.getCurrentQuestion().getQuestionText());

    MultipleChoiceQuestion firstQuestion =
        (MultipleChoiceQuestion) quiz.getCurrentQuestion();

String[] firstChoices = firstQuestion.getChoices();

answer1.setText(firstChoices[0]);
answer2.setText(firstChoices[1]);
answer3.setText(firstChoices[2]);
answer4.setText(firstChoices[3]);

    answer1.setVisible(true);
    answer2.setVisible(true);
    answer3.setVisible(true);
    answer4.setVisible(true);

    answers.selectToggle(null);
    resultLabel.setText("");

    submitButton.setVisible(true);
    submitButton.setDisable(false);
    nextButton.setVisible(true);
    restartButton.setVisible(false);
});

restartButton.setVisible(false);

nextButton.setOnAction(e -> {

    if (quiz.hasNextQuestion()) {
        quiz.nextQuestion();
        progressLabel.setText("Question " + (quiz.getCurrentQuestionIndex() + 1) + " of 10");

        Question nextQuestion = quiz.getCurrentQuestion();
questionLabel.setText(nextQuestion.getQuestionText());

if (nextQuestion instanceof MultipleChoiceQuestion) {

    answer1.setVisible(true);
    answer2.setVisible(true);
    answer3.setVisible(true);
    answer4.setVisible(true);

    MultipleChoiceQuestion nextMCQuestion =
            (MultipleChoiceQuestion) nextQuestion;

    String[] nextChoices = nextMCQuestion.getChoices();

    answer1.setText(nextChoices[0]);
    answer2.setText(nextChoices[1]);
    answer3.setText(nextChoices[2]);
    answer4.setText(nextChoices[3]);

} else if (nextQuestion instanceof TrueFalseQuestion) {

    answer1.setText("True");
    answer2.setText("False");
    answer3.setVisible(false);
    answer4.setVisible(false);
}

submitButton.setDisable(false);

    answers.selectToggle(null);
resultLabel.setText("");

} else {
    questionLabel.setText("Quiz Complete! Your score: "
        + quiz.getScore() + "/" + quiz.getTotalQuestions());

    answer1.setVisible(false);
    answer2.setVisible(false);
    answer3.setVisible(false);
    answer4.setVisible(false);

    submitButton.setVisible(false);
nextButton.setVisible(false);
restartButton.setVisible(true);

resultLabel.setText("");
}
});

submitButton.setOnAction(e -> {

    RadioButton selectedAnswer =
            (RadioButton) answers.getSelectedToggle();

    if (selectedAnswer == null) {
        resultLabel.setText("Please select an answer.");
        return;
    }

    boolean correct = quiz.submitAnswer(selectedAnswer.getText());

    if (correct) {
        resultLabel.setText("Correct!");
    } else {
        resultLabel.setText("Incorrect!");
    }

});

VBox layout = new VBox(10);
layout.setStyle("-fx-background-color: #FFF0F5;");
layout.setPadding(new Insets(20));
layout.setAlignment(Pos.CENTER);

layout.getChildren().addAll(
        titleLabel,
        progressLabel,
        questionLabel,
        answer1,
        answer2,
        answer3,
        answer4,
        submitButton,
        resultLabel,
        nextButton,
        restartButton
);

Scene scene = new Scene(layout, 500, 400);

stage.setScene(scene);
stage.show();    
}
    public static void main(String[] args) {
    launch(args);
}
}
