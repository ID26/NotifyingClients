package com.sber.denisov.mail1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SendEmail bean = context.getBean(SendEmail.class);
        bean.sendMail();

    }
}
