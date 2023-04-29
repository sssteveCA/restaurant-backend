package com.onlinerestaurant.restaurant.beans;

import java.util.Properties;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;


public class MailConfiguration {

    public JavaMailSender getMailConf(){
        JavaMailSenderImpl jmsi = new JavaMailSenderImpl();
        jmsi.setHost("smtp.gmail.com");
        jmsi.setPort(587);
        jmsi.setUsername("steppuggio@gmail.com");
        jmsi.setPassword("CiaoBla96=!31");
        Properties props = jmsi.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.debug","true");
        return jmsi;
    }
}
