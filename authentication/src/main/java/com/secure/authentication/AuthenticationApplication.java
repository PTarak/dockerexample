package com.secure.authentication;

import com.secure.authentication.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class AuthenticationApplication {
	@Autowired
	MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

/*	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		mailService.sendMail("potturitarak@gmail.com","First Mail", "This is the dummy mail from our spring boot application");
	}*/
}
