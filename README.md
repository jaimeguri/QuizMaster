# QuizMaster – Disney Quiz Application

## Project Information

**Course:** CSI 2300  
**Project Name:** QuizMaster  
**Team Name:** QuizMaster  
**Team Member:** Jaime Guri  
**Team Size:** Individual Project

## Project Description

QuizMaster is a completed Java-based Disney trivia application developed using JavaFX and Apache NetBeans.

The application allows users to answer 10 Disney-themed questions, including multiple-choice and true/false questions, through an interactive graphical user interface.

I chose this project because quiz applications are useful for testing knowledge while demonstrating object-oriented programming concepts.

## Main Features

- 10 Disney-themed trivia questions
- Multiple-choice and true/false questions
- Soft pink JavaFX graphical user interface
- Selectable answer buttons
- Submit Answer and Next Question buttons
- Immediate correct or incorrect feedback
- Automatic score tracking
- Question progress indicator (Question X of 10)
- Final score displayed out of 10
- Restart Quiz functionality

## Final UML Class Diagram

<img width="5774" height="5375" alt="Quiz Management Framework-2026-10-07-202552" src="https://github.com/user-attachments/assets/ae3d89a8-bb17-497b-978b-3d408d978e5f" />

## Application Design

The application uses five main Java classes.

### QuizMasterFX

Creates the JavaFX graphical user interface, displays questions and answer choices, handles button actions, updates the progress indicator, and displays the final score.

### Question

The parent class that stores the question text and correct answer. It includes methods for retrieving question information and checking answers.

### MultipleChoiceQuestion

Extends the Question class and stores an array of possible answers for multiple-choice questions.

### TrueFalseQuestion

Extends the Question class and represents questions with True or False answers.

### Quiz

Manages the questions, current question index, score tracking, answer submissions, navigation, and restart functionality.

## Object-Oriented Programming Concepts

QuizMaster demonstrates:

- Encapsulation
- Inheritance
- Polymorphism
- Method overriding
- Strings and arrays
- ArrayList collections
- Conditional statements
- Object-oriented class design

## How to Run QuizMaster

1. Open Apache NetBeans.
2. Open the QuizMaster Maven project.
3. Make sure Java and Maven are configured.
4. Run the application using the JavaFX Maven goal `javafx:run`.
5. The Disney Quiz application window will appear.

**Main application class:** `com.mycompany.quizmaster.QuizMasterFX`

## How to Use the Application

1. Read the Disney trivia question displayed on the screen.
2. Select an answer.
3. Click **Submit Answer**.
4. Review the correct or incorrect feedback.
5. Click **Next Question**.
6. Continue until all 10 questions are answered.
7. View your final score.
8. Click **Restart Quiz** to play again.

## Testing

The completed application was tested for:

- Correct and incorrect answers
- Multiple-choice and true/false questions
- Score tracking
- Question navigation
- Progress indicator updates
- Final score display
- Restart functionality

## Challenges and Solutions

During development, I encountered JavaFX configuration issues, incorrect package placement, and problems with program structure.

I resolved these issues by correcting the Maven configuration, organizing the Java classes into the correct packages, and updating the quiz logic.

I also implemented inheritance to support different question types and reset functionality to allow users to restart the quiz.

## Final Result

QuizMaster is a functional Disney trivia application with a graphical user interface, 10 questions, automatic scoring, answer feedback, question navigation, and restart functionality.

This project helped me apply Java programming concepts, graphical user interface development, inheritance, polymorphism, collections, and object-oriented design.

## Project Documentation

The GitHub repository includes the Java source code, user manual, implementation manual, and final UML class diagram.

**Student:** Jaime Guri  
**Course:** CSI 2300
