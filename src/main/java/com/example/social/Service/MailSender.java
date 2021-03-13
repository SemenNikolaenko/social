package com.example.social.Service;

public interface MailSender {
    void send(String emailTo, String subject, String message);
}
