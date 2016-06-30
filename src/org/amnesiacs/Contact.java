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
public class Contact {
    private Name name;
    private PhoneNumber number;

    public Contact(Name name) {
        this.name = name;
        this.number = null;
    }

    public Contact(Name name, PhoneNumber number) {
        this.name = name;
        this.number = number;
    }

    public Name getNameObj() {
        return this.name;
    }
    
    public String getName() {
        return this.getNameObj().getName();
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getNumber() {
        return number;
    }

    public void setNumber(PhoneNumber number) {
        this.number = number;
    }
    
    
    
    
}
