/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizmaster;

/**
 *
 * @author jaimeguri
 */
public class Question {

    private String questionText;
    private String correctAnswer;

public Question(String questionText, String correctAnswer) {
    this.questionText = questionText;
    this.correctAnswer = correctAnswer;
}

public String getQuestionText() {
    return questionText;
}

public String getCorrectAnswer() {
    return correctAnswer;
}

public boolean checkAnswer(String answer) {
    return answer.equalsIgnoreCase(correctAnswer);
}

public String getQuestionType() {
    return "Question";
}

}