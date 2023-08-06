package com.secure.authentication.controller;

import com.secure.authentication.dto.EmailInfoDTO;
import com.secure.authentication.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MailController {
    @Autowired
    MailService mailService;

    @GetMapping(value = "/sendMail",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sendMail(@RequestBody EmailInfoDTO emailInfoDTO) {

        System.out.println(emailInfoDTO.toString());
        mailService.sendMail(emailInfoDTO.getTo(), emailInfoDTO.getSubject(), emailInfoDTO.getBody());
        System.out.println("Mail sent!!!");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Email sent successfully");
    }

}
