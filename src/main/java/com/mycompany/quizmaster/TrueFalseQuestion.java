/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizmaster;

/**
 *
 * @author jaimeguri
 */
public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String questionText, String correctAnswer) {
    super(questionText, correctAnswer);
}

@Override
public String getQuestionType() {
    return "True/False";
}
}
