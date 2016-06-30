/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.amnesiacs;

/**
 *
 * @author lphernandez
 */
public class Menu {
    
    public static void displayGUI() {
        System.out.println();
        System.out.println("1 - Print list of contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Update existing contact");
        System.out.println("4 - Remove contact");
        System.out.println("5 - Power off");
        System.out.println();
        System.out.println("Please enter your choice: ");
    }
    
    public static void displayBusinessOrIndividual() {
        System.out.println();
        System.out.println("Is this contact a business or an individual?");
        System.out.println("1 - Business");
        System.out.println("2 - Individual");
        System.out.println();
        System.out.println("Please enter your choice: ");
    }
    
    public static void displayPhoneNumber() {
        System.out.println();
        System.out.println("Does this contact have a phone number?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        System.out.println();
        System.out.println("Please enter your choice: ");
    }
    
    public static void displayInternationalOrDomestic() {
        System.out.println();
        System.out.println("Is this phone number International or Domestic");
        System.out.println("1 - International");
        System.out.println("2 - Domestic");
        System.out.println();
        System.out.println("Please enter your choice: ");
    }
    
}
