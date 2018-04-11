package com.jmall.service;

import com.jmall.entity.Payment;

public interface PaymentService {
	
	
	public int addPayment(Payment payment) ;
	
	
	public int updatePaymentStatus(Payment payment) ;
	
	
	public int finishPayment(Payment payment) ;
	
	
	public Payment getPaymentByTradeNo(String tradeNo) ;
	
	
	public  String notifyBusi(Payment payment);
}
