package com.example.openai.application.dto;

import com.example.openai.domain.chat.ChatUsage;
import com.example.openai.domain.chat.ChatChoice;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class ChatResponse implements Serializable {

    private String id;
    private String object;
    private LocalDate created;
    private String model;
    private ChatUsage chatUsage;
    private List<ChatChoice> chatChoices;
}