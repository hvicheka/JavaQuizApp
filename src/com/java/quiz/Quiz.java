package com.java.quiz;

import java.util.Scanner;

public class Quiz {
    void begin() {
        Question q1 = new Question("Who invented Java Programming?", "Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", new Answer("James Gosling"));
        Question q2 = new Question("Which statement is true about Java?", "Java is a sequence-dependent programming language", " Java is a code dependent programming language", "Java is a platform-dependent programming language", "Java is a platform-independent programming language", new Answer("Java is a platform-independent programming language"));
        Question q3 = new Question("Which component is used to compile, debug and execute the java programs?", "JRE", "JIT", "JDK", "JVM", new Answer("JDK"));
        Question q4 = new Question("Which one of the following is not a Java feature?", "Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible", new Answer("Use of pointers"));
        Question q5 = new Question("Which of these cannot be used for a variable name in Java?", "identifier & keyword", "identifier", "keyword", "identifier", new Answer("keyword"));
        Question q6 = new Question("What is the extension of java code files?", ".js", ".txt", ".class", ".java", new Answer(".java"));
        Question[] questions = {q1, q2, q3, q4, q5, q6};
        int countCorrect = 0;
        int countWrong = 0;
        int countTotal = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            System.out.println("A. " + question.getOption1());
            System.out.println("B. " + question.getOption2());
            System.out.println("C. " + question.getOption3());
            System.out.println("D. " + question.getOption4());
            System.out.println("Enter an option: ");

            Scanner scanner = new Scanner(System.in);

            char option = scanner.next().charAt(0);
            String answer = "";

            switch (option) {
                case 'A':
                    answer = question.getOption1();
                    break;
                case 'B':
                    answer = question.getOption2();
                    break;
                case 'C':
                    answer = question.getOption3();
                    break;
                case 'D':
                    answer = question.getOption4();
                    break;
                default:
                    break;
            }

            if (answer.equals(question.answer.getAnswer())) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Correct Answer");
                System.out.println("----------------------------------------------------------");
                countCorrect++;
            } else {
                System.out.println("----------------------------------------------------------");
                System.out.println("Wrong Answer");
                System.out.println("----------------------------------------------------------");
                countWrong++;
            }

            System.out.println();
            System.out.print("=======================================================================");
            System.out.println();

            countTotal++;
        }

        Result result = new Result(countTotal, countCorrect, countWrong);

        result.showResult();
    }

}

