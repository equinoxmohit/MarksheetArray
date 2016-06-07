/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.marksheetarray;

import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class Marksheet {

    String[] subjects;
    double[] marks;
    Scanner sc;
    double obtainedMarks = 0;
    double passMarks = 32;
    double fullMarks = 100;
    double totalMarks;
    double perc;

    public Marksheet(String[] subjects, Scanner sc) {
        marks = new double[subjects.length];
        this.sc = sc;
        this.subjects = subjects;
        totalMarks = fullMarks * subjects.length;
        
    }

    public void userInput() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of " + subjects[i] + ":");
            marks[i] = sc.nextDouble();
            obtainedMarks += marks[i];
        }
    }

    public boolean isFail() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 32) {
                return true;
            }
        }
        return false;
    }

    public double percentage() {

        perc = ((obtainedMarks / totalMarks) * 100);
        return perc;

    }

    public void checkDivision() {
        if (perc >=32 && perc<50) {
            System.out.println("You have scored third division");
        }
        else if(perc>=50 && perc <60)
        {
            System.out.println("You have scored second division");
        }
        else if(perc>=60 && perc <80)
        {
            System.out.println("You have scored first division");
        }
        else
        {
            System.out.println("You have scored distinction");
        }
    }

}


