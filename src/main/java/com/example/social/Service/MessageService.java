package com.example.social.Service;

import com.example.social.Entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MessageService {
    Page<Message> findAll(Pageable pageable);
    Message save(Message message);
    Page<Message> findByTag(String tag, Pageable pageable);
    List<Message> findAll();
    List<Message> findByTag(String tag);
}
