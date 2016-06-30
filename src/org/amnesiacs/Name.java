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
public class Name {
    private String firstName;
    private String lastName;
    private String businessName;

    public Name(String businessName) {
        this.businessName = businessName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getName() {
        String bName, fName, lName;
        bName = this.businessName;
        fName = this.firstName;
        lName = this.lastName;
        if ((!(fName == null) || (!(lName == null))) && (bName == null)) {
            return firstName + " " + lastName;
        } else if (((fName == null) || (lName == null)) && (!(bName == null))) {
            return businessName;
        }
        return null;
    }
    
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setName(String businessName) {
        this.businessName = businessName;
    }
    
}
