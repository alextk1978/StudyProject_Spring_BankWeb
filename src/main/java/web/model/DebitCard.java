package web.model;

import java.util.Calendar;

public class DebitCard {

    public DebitCard(){

    }

    public DebitCard(double currentBalance, String cardNumber, int cvv) {
        this.currentBalance = currentBalance;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    private double currentBalance;
    private String cardNumber;
    private Calendar endOfCard;
    private int cvv;


    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Calendar getEndOfCard() {
        return endOfCard;
    }

    public void setEndOfCard(Calendar endOfCard) {
        this.endOfCard = endOfCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
