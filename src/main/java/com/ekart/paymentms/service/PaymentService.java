package com.ekart.paymentms.service;

import java.util.List;

import com.ekart.paymentms.entity.Payment;

public interface PaymentService {
	
	public Payment savePayment(Payment payment);
	public List<Payment> getPaymentMethods(Integer id);
	
	public List<Payment> getAll();
}
