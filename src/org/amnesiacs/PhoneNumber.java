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
public class PhoneNumber {
    private int internationalPrefix;
    private int areaCode;
    private int prefix;
    private int exchange;

    public PhoneNumber(int areaCode, int prefix, int exchange) {
        this.internationalPrefix = 1;
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.exchange = exchange;
    }

    public PhoneNumber(int internationalPrefix, int areaCode, int prefix, int exchange) {
        this.internationalPrefix = internationalPrefix;
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.exchange = exchange;
    }
}
