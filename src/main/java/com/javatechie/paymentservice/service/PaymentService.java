package com.javatechie.paymentservice.service;

import com.javatechie.paymentservice.entity.Payment;
import com.javatechie.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment)
    {
        payment.setTranasctionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(paymentProcessing());
        return repository.save(payment);
    }
    private String paymentProcessing()
    {
        return new Random().nextBoolean()?"success":"failed";
    }

}
