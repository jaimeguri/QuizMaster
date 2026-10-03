# QuizMaster - Simple Quiz Application

## Project Information

**Course:** CSI 2300  
**Project Name:** QuizMaster  
**Team Name:** QuizMaster  
**Team Member:** Jaime Guri  
**Team Size:** Individual Project

## Project Description

QuizMaster is a Java-based quiz application that will allow users to answer a series of multiple-choice and true/false questions through a graphical user interface.

I chose this project because quiz applications can be useful for studying and reviewing information. The goal is to create a simple and easy-to-use program that allows users to test their knowledge while also demonstrating object-oriented programming concepts.

The user will begin the quiz from the main screen. Questions will appear one at a time with possible answers. The user will select an answer and continue to the next question. The program will determine whether each answer is correct and keep track of the user's score. At the end of the quiz, the user's final score will be displayed.

The graphical user interface will be created using JavaFX. The project will use object-oriented programming concepts including classes, inheritance, polymorphism, Strings, arrays or lists, conditions, and loops.

## Classes

### QuizApp

The `QuizApp` class will start the application and manage the JavaFX graphical user interface.

**Fields:**
- Quiz quiz
- Label questionLabel
- Button nextButton
- ToggleGroup answerGroup

**Methods:**
- start(Stage stage)
- displayQuestion()
- handleAnswer()
- displayResults()

### Question

The `Question` class will be the parent class for the different types of questions.

**Fields:**
- String questionText
- String correctAnswer

**Methods:**
- Question(String questionText, String correctAnswer)
- getQuestionText()
- getCorrectAnswer()
- checkAnswer(String answer)
- getQuestionType()

### MultipleChoiceQuestion

The `MultipleChoiceQuestion` class will represent questions with multiple answer choices and will inherit from the `Question` class.

**Fields:**
- String[] choices

**Methods:**
- MultipleChoiceQuestion(String questionText, String correctAnswer, String[] choices)
- getChoices()
- getQuestionType()

**Inheritance:** MultipleChoiceQuestion extends Question

### TrueFalseQuestion

The `TrueFalseQuestion` class will represent questions that can be answered with true or false.

**Methods:**
- TrueFalseQuestion(String questionText, String correctAnswer)
- getQuestionType()

**Inheritance:** TrueFalseQuestion extends Question

### Quiz

The `Quiz` class will manage the questions, the user's progress, and the score.

**Fields:**
- ArrayList<Question> questions
- int currentQuestion
- int score

**Methods:**
- addQuestion(Question question)
- getCurrentQuestion()
- submitAnswer(String answer)
- nextQuestion()
- hasNextQuestion()
- getScore()
- getTotalQuestions()
- resetQuiz()

The Quiz class will store both `MultipleChoiceQuestion` and `TrueFalseQuestion` objects as `Question` objects. This will allow the project to demonstrate inheritance and polymorphism.

## Initial UML Class Diagram
<img width="6514" height="5690" alt="Initial UML Class Diagram" src="https://github.com/user-attachments/assets/09e6ad66-2774-4c87-9e67-e580a1b82e06" />

## Project Plan and Estimated Effort

I'm doing the project alone.

### Phase 1: Planning and Design

- Plan the main features of the application.
- Design the classes and relationships.
- Create the initial UML diagram.
- Plan the quiz questions and answers.
- Create the GitHub repository.

### Phase 2: User Interface and Core Classes

- Create the basic JavaFX interface.
- Create the Question class.
- Create the MultipleChoiceQuestion class.
- Create the TrueFalseQuestion class.
- Create the Quiz class.
- Add buttons and answer selections to the GUI.

### Phase 3: Application Development

- Connect the GUI to the quiz classes.
- Add quiz questions and answers.
- Add answer checking.
- Add score tracking.
- Allow the user to move between questions.
- Display the final score.
- Add an option to restart the quiz.

### Phase 4: Testing and Improvements

- Test multiple-choice questions.
- Test true/false questions.
- Test score calculations.
- Test different user inputs.
- Fix errors and improve the interface.

### Phase 5: Documentation and Presentation

- Complete the README.
- Create the user manual.
- Create the implementation manual.
- Update the UML diagram if necessary.
- Prepare the final presentation and demonstration.

**Estimated Total Effort: 15-22 hours**

## Project Milestones

1. Complete the project design, UML diagram, and basic JavaFX interface.
2. Complete the Question classes and Quiz class and connect them to the interface.
3. Complete testing, documentation, GitHub repository, and final presentation.

## Expected Final Result

The completed QuizMaster application will allow a user to start a quiz, answer multiple-choice and true/false questions, move through the questions, and receive a final score.

The project will demonstrate Java programming concepts including object-oriented design, inheritance, polymorphism, Strings, arrays or lists, conditions, loops, UML class design, and JavaFX GUI development.
