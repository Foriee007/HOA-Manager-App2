package org.cenchev.hoamanager.reservation.service;

import org.cenchev.hoamanager.reservation.model.entity.CreditCard;

public interface CreditCardValidationService {
    boolean validateCreditCard(CreditCard creditCard);
}
