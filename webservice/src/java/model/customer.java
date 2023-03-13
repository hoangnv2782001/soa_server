package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class customer {
    private String cardType;
    private String cardHolderName;
    private String cardNumber;
    private String cvcNumber;
    private String expirationDate;

    public customer() {
    }

    public customer(String cardType, String cardHolderName, String cardNumber, String cvcNumber, String expirationDate) {
        this.cardType = cardType;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvcNumber = cvcNumber;
        this.expirationDate = expirationDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvcNumber() {
        return cvcNumber;
    }

    public void setCvcNumber(String cvcNumber) {
        this.cvcNumber = cvcNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
}
