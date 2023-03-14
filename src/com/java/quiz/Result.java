package com.java.quiz;

public class Result implements ResultInterface {
    public Result(int totalQuestions, int correctAnswer, int wrongAnswer) {
        super();
        this.totalQuestions = totalQuestions;
        this.correctAnswer = correctAnswer;
        this.wrongAnswer = wrongAnswer;
    }

    int totalQuestions;
    int correctAnswer;
    int wrongAnswer;

    @Override
    public void showResult() {
        System.out.println("Your Result: ");
        System.out.println("Total Questions                   : " + this.totalQuestions);
        System.out.println("Correct Answers                   : " + this.correctAnswer);
        System.out.println("Wrong Answers                     : " + this.wrongAnswer);
        System.out.println("Percentage                        : " + showPercentage(correctAnswer, totalQuestions));
        System.out.println("Overall Performance               : " + showPerformance(showPercentage(correctAnswer, totalQuestions)));
    }

    @Override
    public double showPercentage(int correctAnswer, int totalQuestions) {
        return (double) (correctAnswer / totalQuestions) * 100;
    }

    @Override
    public String showPerformance(double percentage) {
        String performance = "";
        if (percentage > 60) {
            performance = "Good";
        } else if (percentage < 40) {
            performance = "Poor";
        } else {
            performance = "Average";
        }
        return performance;
    }
}
