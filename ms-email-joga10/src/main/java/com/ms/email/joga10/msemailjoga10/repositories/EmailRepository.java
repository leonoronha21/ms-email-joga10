package com.ms.email.joga10.msemailjoga10.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.joga10.msemailjoga10.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
    
}
