package com.ekart.paymentms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekart.paymentms.entity.Payment;
import com.ekart.paymentms.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepository repository;
	
	@Override
	public Payment savePayment(Payment payment) {
		return repository.save(payment);
	}

	@Override
	public List<Payment> getPaymentMethods(Integer id) {
		return repository.findAll().stream().filter(payment -> payment.getCustomerId() == id).toList();
	}

	
	
	@Override
	public List<Payment> getAll() {
		
		return repository.findAll();
	}

}
