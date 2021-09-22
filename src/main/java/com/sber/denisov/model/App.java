package com.sber.denisov.model;

import com.sber.denisov.model.cards.BankCard;
import com.sber.denisov.model.cards.CreditCard;
import com.sber.denisov.model.cards.DebitCard;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Address beanAddress = context.getBean("beanAddress", Address.class);
        System.out.println(beanAddress.toString());
//        create client
//        create card

//        check expiryDate
//        create sendMessage
    }
}
