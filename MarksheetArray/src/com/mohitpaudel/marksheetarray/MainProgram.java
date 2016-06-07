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
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);   
        
        String[] subjects={"English","Nepali","Math","Science","Computer"};
            
            
            Marksheet ms=new Marksheet(subjects, sc);
            ms.userInput();
            
            if(ms.isFail())
            {
                System.out.println("You are fail");
                
            }
            
            else
            {
                System.out.println("Your percentage is: "+ms.percentage());
                          
            }
                      
            ms.checkDivision();
            
    }
}
