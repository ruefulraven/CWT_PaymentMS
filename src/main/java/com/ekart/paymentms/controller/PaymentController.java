package com.ekart.paymentms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.paymentms.entity.Payment;
import com.ekart.paymentms.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService service;
	
	@PostMapping(value = "/addCustomerPayment", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Payment addPayment(@RequestBody Payment payment){
		return service.savePayment(payment);
	}
	
	@GetMapping("/getAllPaymentMethods/{customerId}")
	public List<Payment> allPaymentMethods(@PathVariable Integer customerId){
		return service.getPaymentMethods(customerId);
	}
	
	@GetMapping("/")
	public List<Payment> All(){
		return service.getAll();
	}
}
