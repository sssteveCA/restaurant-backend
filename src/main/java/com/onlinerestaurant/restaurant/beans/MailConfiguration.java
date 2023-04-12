package com.onlinerestaurant.restaurant.beans;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfiguration {
    
    @Bean
    public JavaMailSender getMailConf(){
        JavaMailSenderImpl jmsi = new JavaMailSenderImpl();
        jmsi.setHost("");
        jmsi.setPort(25);
        jmsi.setUsername("");
        jmsi.setPassword("");
        Properties props = jmsi.getJavaMailProperties();
        props.put("mail.transport.protocol", "");
        props.put("mail.smtp.auth","");
        props.put("mail.smtp.starttls.enable","");
        props.put("mail.debug","");
        return jmsi;
    }
}
