package org.acme.cc_approval.model;

import java.time.LocalDate;
import java.util.Random;

public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private LocalDate expirationDate;
    private String cvv;
    private Double creditLimit;

    public CreditCard() {}

    // Constructor, getters, and setters
    public CreditCard(String cardHolderName, Double creditLimit) {
        this.cardHolderName = cardHolderName;
        this.creditLimit = creditLimit;
        this.cardNumber = generateCardNumber();
        this.expirationDate = generateExpirationDate();
        this.cvv = generateCVV();
    }

    // Getters and setters (omitted for brevity)

    private String generateCardNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    private LocalDate generateExpirationDate() {
        return LocalDate.now().plusYears(3);
    }

    private String generateCVV() {
        Random random = new Random();
        return String.format("%03d", random.nextInt(1000));
    }

    @Override
    public String toString() {
        return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", expirationDate="
                + expirationDate + ", cvv=" + cvv + ", creditLimit=" + creditLimit + "]";
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
        result = prime * result + ((cardHolderName == null) ? 0 : cardHolderName.hashCode());
        result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
        result = prime * result + ((cvv == null) ? 0 : cvv.hashCode());
        result = prime * result + ((creditLimit == null) ? 0 : creditLimit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CreditCard other = (CreditCard) obj;
        if (cardNumber == null) {
            if (other.cardNumber != null)
                return false;
        } else if (!cardNumber.equals(other.cardNumber))
            return false;
        if (cardHolderName == null) {
            if (other.cardHolderName != null)
                return false;
        } else if (!cardHolderName.equals(other.cardHolderName))
            return false;
        if (expirationDate == null) {
            if (other.expirationDate != null)
                return false;
        } else if (!expirationDate.equals(other.expirationDate))
            return false;
        if (cvv == null) {
            if (other.cvv != null)
                return false;
        } else if (!cvv.equals(other.cvv))
            return false;
        if (creditLimit == null) {
            if (other.creditLimit != null)
                return false;
        } else if (!creditLimit.equals(other.creditLimit))
            return false;
        return true;
    }
}

