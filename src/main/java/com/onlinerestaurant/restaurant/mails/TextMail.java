package com.onlinerestaurant.restaurant.mails;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class TextMail{
    
    private String from;
    
    private String to;
    
    private String subject;
    
    private String text;

    public TextMail(Map<String, String> data){
        this.checkMap(data);
    }

    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getSubject() { return subject; }
    public String getText() { return text; }

    private void checkMap(Map<String, String> data){
        if(data.containsKey("from") && data.containsKey("to") && data.containsKey("subject") && data.containsKey("text")){
            this.from = data.get("from");
            this.to = data.get("to");
            this.subject = data.get("subject");
            this.text = data.get("text");
        }//if(data.containsKey("from") && data.containsKey("to") && data.containsKey("subject") && data.containsKey("text")){
    }


    
}
