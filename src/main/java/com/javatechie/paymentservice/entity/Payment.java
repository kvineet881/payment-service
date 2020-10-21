package com.javatechie.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Payment_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int paymentId;
    private String paymentStatus;
    private String  tranasctionId;
    private  int orderId;
    private double ammount;
}
