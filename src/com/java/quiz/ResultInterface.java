package com.java.quiz;

public interface ResultInterface {
    void showResult();

    double showPercentage(int correctAnswer, int totalQuestions);

    String showPerformance(double percentage);
}
