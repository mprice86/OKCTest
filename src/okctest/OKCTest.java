package okctest;

import javax.swing.JOptionPane;

//Author - Matthew Price
public class OKCTest {
    //variables for each persons answer
    static int answerVal1 = 0; //person1's answer
    static int answerVal2 = 0; //person2's answer
    //variables for each persons desired answer
    static int desiredVal1 = 0;    //person1's desired answer
    static int desiredVal2 = 0;    //person2's desired answer
    //variables for each persons answer importance
    static int importVal1 = 0; //person1's answer value
    static int importVal2 = 0; //person2's answer value
    //variables to keep score
    static int person1Score = 0;
    static int person2Score = 0;
    //variables to store max score
    static int max1Score = 0;
    static int max2Score = 0;
    static int numberOfQuestions = 0;

    public static void main(String[] args) {
        //run the questions one after the other
        question1();
        question2();
        question3();

        //Store the variable outcomes from the questions
        double score1 = person1Score;
        double max1 = max1Score;
        double score2 = person2Score;
        double max2 = max2Score;
        double NthRoot = numberOfQuestions;

        //get match percentages for each person
        double combinedScore = ((score1 / max1) * 100) * ((score2 / max2) * 100);

        //get the combined match percentage
        String ans = String.valueOf(root(combinedScore, NthRoot));
        System.out.println("Match is " + ans.substring(0,3).replace(".", "") + "%");
        //Write in IF statement to round percentages up or down as needed
        //if (ans.substring(0,3) == "100") {
        //  System.out.print(ans + "%");
        // etc....
    }

    public static double root(double combinedScore, double NthRoot) {
        //Power control variable
        double i;
        //if the number of common questions is less than 2 then 
        if (NthRoot <= 2) {
            //set to 1
            i = 1;
        } else {
            //else set it to half of the number of questions
            i = NthRoot / 2;
        }
        //get the nth root of the two match percentages multipled by each other
        double pow = i / NthRoot;
        return Math.pow(combinedScore, pow);
    }

    public static void getImportance() {
        importVal1 = checkImportance.checkImportVal(importVal1);
        importVal2 = checkImportance.checkImportVal(importVal2);
    }

    public static void getScore() {
        if (desiredVal1 == answerVal2) {
            person2Score = person2Score + importVal1;
            max2Score = max2Score + importVal1;
        } else {
            max2Score = max2Score + importVal1;
        }

        if (desiredVal2 == answerVal1) {
            person1Score = person1Score + importVal2;
            max1Score = max1Score + importVal2;
        } else {
            max1Score = max1Score + importVal2;
        }
    }

    public static void question1() {
        //Question one - How messy are you?
        answerVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - How messy are you? 1 = very, 2 = average, 3 = organised"));
        desiredVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - How messy would you want an SO to be? 1 = very, 2 = average, 3 = organised"));
        importVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - How important is this to you? 1 = irrelevant, 2 = a little, 3 = somewhat, 4 = very, 5 = mandatory"));

        answerVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - How messy are you? 1 = very, 2 = average, 3 = organised"));
        desiredVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - How messy would you want an SO to be? 1 = very, 2 = average, 3 = organised"));
        importVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - How important is this to you? 1 = irrelevant, 2 = a little, 3 = somewhat, 4 = very, 5 = mandatory"));

        getImportance();
        getScore();
        numberOfQuestions++;
    }

    public static void question2() {
        //Question 2 - Do you like to be the center of attention?
        answerVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - Do you like to be the centre of attention? 1 = yes, 2 = no"));
        desiredVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - How would you like an SO to respond? 1 = yes, 2 = no"));
        importVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - How important is this to you? 1 = irrelevant, 2 = a little, 3 = somewhat, 4 = very, 5 = mandatory"));

        answerVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - Do you like to be the centre of attention? 1 = yes, 2 = no"));
        desiredVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - How would you like an SO to respond? 1 = yes, 2 = no"));
        importVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - How important is this to you? 1 = irrelevant, 2 = a little, 3 = somewhat, 4 = very, 5 = mandatory"));

        getImportance();
        getScore();
        numberOfQuestions++;
    }

    public static void question3() {
        //Question 2 - Do you believe in god?
        answerVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - Do you believe in god? 1 = yes, 2 = no"));
        desiredVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - How would you like an SO to respond? 1 = yes, 2 = no"));
        importVal1 = Integer.parseInt(JOptionPane.showInputDialog("Person 1 - How important is this to you? 1 = irrelevant, 2 = a little, 3 = somewhat, 4 = very, 5 = mandatory"));

        answerVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - Do you believe in god? 1 = yes, 2 = no"));
        desiredVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - How would you like an SO to respond? 1 = yes, 2 = no"));
        importVal2 = Integer.parseInt(JOptionPane.showInputDialog("Person 2 - How important is this to you? 1 = irrelevant, 2 = a little, 3 = somewhat, 4 = very, 5 = mandatory"));

        getImportance();
        getScore();
        numberOfQuestions++;
    }
}