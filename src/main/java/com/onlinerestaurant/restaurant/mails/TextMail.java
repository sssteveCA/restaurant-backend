package com.onlinerestaurant.restaurant.mails;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.onlinerestaurant.restaurant.beans.MailConfiguration;
import com.onlinerestaurant.restaurant.exceptions.MalformedMapException;

public class TextMail{

    private MailConfiguration mc;
    
    private String from;
    
    private String to;
    
    private String subject;
    
    private String text;

    public TextMail(Map<String, String> data) throws MalformedMapException{
        this.checkMap(data);
        this.sendMail();
    }

    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getSubject() { return subject; }
    public String getText() { return text; }

    private void checkMap(Map<String, String> data) throws MalformedMapException{
        if(data.containsKey("from") && data.containsKey("to") && data.containsKey("subject") && data.containsKey("text")){
            this.from = data.get("from");
            this.to = data.get("to");
            this.subject = data.get("subject");
            this.text = data.get("text");
        }//if(data.containsKey("from") && data.containsKey("to") && data.containsKey("subject") && data.containsKey("text")){
        else throw new MalformedMapException();
    }

    private void sendMail(){
        this.mc = new MailConfiguration();
        JavaMailSender jms = this.mc.getMailConf();
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setFrom(this.from);
        smm.setTo(this.to);
        smm.setSubject(this.subject);
        smm.setText(this.text);
        jms.send(smm);
    }


    
}
