package com.raulcorreia.hrpayroll.services;

import com.raulcorreia.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Doquinha", 400.0, days);
    }
}
