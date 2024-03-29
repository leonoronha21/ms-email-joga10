package com.ms.email.joga10.msemailjoga10.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ms.email.joga10.msemailjoga10.dtos.EmailDto;
import com.ms.email.joga10.msemailjoga10.models.EmailModel;
import com.ms.email.joga10.msemailjoga10.services.EmailService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmailController {
    @Autowired
    EmailService emailService;


    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }
    
}
