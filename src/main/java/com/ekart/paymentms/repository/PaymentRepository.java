package com.ekart.paymentms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekart.paymentms.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
