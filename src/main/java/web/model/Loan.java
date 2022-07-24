package web.model;

import java.util.Date;

public class Loan {
    private Date registration = new Date();
    private double summ;
    private double percentBid;
    private int durationLoan;
    private double paymentMonthly;

    public Date getRegistration() {
        return registration;
    }


    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public double getSumm() {
        return summ;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public double getPercentBid() {
        return percentBid;
    }

    public void setPercentBid(double percentBid) {
        this.percentBid = percentBid;
    }

    public int getDurationLoan() {
        return durationLoan;
    }

    public void setDurationLoan(int durationLoan) {
        this.durationLoan = durationLoan;
    }

    public double getPaymentMonthly() {
        return paymentMonthly;
    }

    public void setPaymentMonthly(double paymentMonthly) {
        this.paymentMonthly = paymentMonthly;
    }
}
