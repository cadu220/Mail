package com.ms.email.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.email.Dtos.EmailDTO;
import com.ms.email.models.EmailModel;
import com.ms.email.services.EmailService;

import jakarta.validation.Valid;

@RestController
public class EmailController {

	
	@Autowired
	EmailService emailService;
	
	@PostMapping("/sending-email")
	public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDTO emailDto){
		EmailModel emailModel = new EmailModel();
		System.out.printf( "entrouuuuu");
		BeanUtils.copyProperties(emailDto, emailModel);
		emailService.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
	}
}
