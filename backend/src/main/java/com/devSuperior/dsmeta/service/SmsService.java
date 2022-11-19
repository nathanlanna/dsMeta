package com.devSuperior.dsmeta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.devSuperior.dsmeta.entities.Venda;
import com.devSuperior.dsmeta.repositories.SalesRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {

	@Value("${twilio.sid}")
	private String twilioSid;

	@Value("${twilio.key}")
	private String twilioKey;

	@Value("${twilio.phone.from}")
	private String twilioPhoneFrom;

	@Value("${twilio.phone.to}")
	private String twilioPhoneTo;

	@Autowired
	private SalesRepository repository;
	
	public void sendSms(Long saleId) {

		Venda sale = repository.findById(saleId).get();
		
		String msg = "vendedor" + sale.getSellerName() + " Data: "+ sale.getDate().getMonth()
				+ "/" + sale.getDate().getYear() + " um total de R$ "+ String.format("%.2f",sale.getAmount());
		
		Twilio.init(twilioSid, twilioKey);

		PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

		Message message = Message.creator(to, from, "O Nathan te Ama muito").create();

		System.out.println(message.getSid());
	}
}