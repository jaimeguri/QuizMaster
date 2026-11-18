/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizmaster;

/**
 *
 * @author jaimeguri
 */
public class MultipleChoiceQuestion extends Question {
    private String[] choices;

public MultipleChoiceQuestion(String questionText, String correctAnswer, String[] choices) {
    super(questionText, correctAnswer);
    this.choices = choices;
}

public String[] getChoices() {
    return choices;
}

@Override
public String getQuestionType() {
    return "Multiple Choice";
}
}
