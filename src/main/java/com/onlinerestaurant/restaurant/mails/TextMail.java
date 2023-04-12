package com.onlinerestaurant.restaurant.mails;

import org.springframework.stereotype.Component;

@Component
public class TextMail{
    
    private String from;
    
    private String to;
    
    private String subject;
    
    private String text;

    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getSubject() { return subject; }
    public String getText() { return text; }
    
}
