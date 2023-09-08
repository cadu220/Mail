package com.ms.email.Dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDTO {
	//@NotBlank(message = "O campo emailFrom não deve estar em branco")
	private String ownerRef;
	//@NotBlank(message = "O campo emailFrom não deve estar em branco")
	@Email
	private String emailFrom;
	//@NotBlank(message = "O campo emailTo não deve estar em branco")
	@Email
	private String emailTo;
	//@NotBlank
	private String subject;
	//@NotBlank
	private String text;
	public String getOwnerRef() {
		return ownerRef;
	}
	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
