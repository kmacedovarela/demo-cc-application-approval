package org.acme.cc_approval.service;

import org.acme.cc_approval.model.*;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreditCardService {
    public CreditCard generateCreditCardDetails(Applicant applicant) {
        // Calculate credit limit based on income (simplified logic)
        double creditLimit = applicant.getAnnualIncome() * 0.3;
        return new CreditCard(applicant.getName(), creditLimit);
    }
}

