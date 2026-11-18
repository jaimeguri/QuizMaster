/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizmaster;

import java.util.ArrayList;

/**
 *
 * @author jaimeguri
 */
public class Quiz {
    private ArrayList<Question> questions;
private int currentQuestion;
private int score;

public Quiz() {
    questions = new ArrayList<>();
    currentQuestion = 0;
    score = 0;
}
public void addQuestion(Question question) {
    questions.add(question);
}
public Question getCurrentQuestion() {
    return questions.get(currentQuestion);
}
public boolean submitAnswer(String answer) {
    boolean correct = getCurrentQuestion().checkAnswer(answer);

    if (correct) {
        score++;
    }

    return correct;
}
public void nextQuestion() {
    currentQuestion++;
}
public boolean hasNextQuestion() {
    return currentQuestion < questions.size() - 1;
}
public int getScore() {
    return score;
}
public int getTotalQuestions() {
    return questions.size();
}
public int getCurrentQuestionIndex() {
    return currentQuestion;
}
public void resetQuiz() {
    currentQuestion = 0;
    score = 0;
}
}
