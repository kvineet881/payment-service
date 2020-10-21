package com.javatechie.paymentservice.controller;

import com.javatechie.paymentservice.entity.Payment;
import com.javatechie.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
   public Payment findPaymentHistoryByOrderId(@PathVariable int orderId)
   {
       return service.findPaymentHistoryByOrderId(orderId);
   }
}
