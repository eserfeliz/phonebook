/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.amnesiacs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

/**
 *
 * @author lphernandez
 */
public class Phonebook {
    Contact contact;
    Name name;
    PhoneNumber phoneNumber;
    private static ArrayList<Contact> contacts;
    private boolean isRunning;
    
    public Phonebook(boolean isRunning) {
        contacts = new ArrayList<>();
        this.isRunning = isRunning;
    }
    
    public void init() {
        System.out.println("Starting mobilePhone OS v0.1");
        System.out.print(".");
        try {
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    
    public void run(boolean isRunning) {
        this.isRunning = isRunning;
        int menuChoice = 0;
        Scanner scanner = new Scanner(System.in);
        while (this.isRunning) {
            Menu.displayGUI();
            menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    displayContacts();
                    break;
                case 2:
                    addContact();
                    break;
                default:
                    this.isRunning = false;
                    break;
            }
        }
    }
    
    public void displayContacts() {
        System.out.println();
        System.out.println("List of contacts:");
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println(contacts.get(i).getName());
        }
        System.out.println();
    }
    
    public boolean addContact() {
        Scanner choiceScanner = new Scanner(System.in);
        Scanner nameScanner = new Scanner(System.in);
        Scanner phoneScanner = new Scanner(System.in);
        
        String bName, fName, lName;
        int intlPrefix = 1, areaCode, prefix, exchange;
        int menuChoice;
        
        contact = null;
        
        Menu.displayBusinessOrIndividual();
        menuChoice = choiceScanner.nextInt();
        switch (menuChoice) {
            case 1:
                System.out.println("Enter the name of the business:");
                bName = nameScanner.nextLine();
                name = new Name(bName);
                break;
            case 2:
                System.out.println("Enter the first name of the individual:");
                fName = nameScanner.nextLine();
                System.out.println("Enter the last name of the individual:");
                lName = nameScanner.nextLine();
                name = new Name(fName, lName);
                break;
            default:
                return false;
        }
        
        Menu.displayPhoneNumber();
        menuChoice = choiceScanner.nextInt();
        switch (menuChoice) {
            case 1:
                Menu.displayInternationalOrDomestic();
                break;
            case 2:
                contact = new Contact(name);
                contacts.add(contact);
                return true;
            default:
                break;
        }
        
        if (Objects.isNull(contact)) { 
            menuChoice = choiceScanner.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("Enter the international prefix: ");
                    intlPrefix = phoneScanner.nextInt();
                case 2:
                    System.out.println("Enter the area code: ");
                    areaCode = phoneScanner.nextInt();
                    System.out.println("Enter the prefix: ");
                    prefix = phoneScanner.nextInt();
                    System.out.println("Enter the exchange: ");
                    exchange = phoneScanner.nextInt();
                    if (Objects.isNull(intlPrefix)) {
                        phoneNumber = new PhoneNumber(1, areaCode, prefix,
                                                      exchange);
                    } else {
                        phoneNumber = new PhoneNumber(intlPrefix, areaCode, 
                                                      prefix, exchange);
                    }
                    contact = new Contact(name, phoneNumber);
                    contacts.add(contact);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }
}
