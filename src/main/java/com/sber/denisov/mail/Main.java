package com.sber.denisov.mail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.Message;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream(
                "C:\\Users\\Иван\\YandexDisk\\Notifying clients\\src\\main\\resources\\config.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            String user = properties.getProperty("mail.user");
            String password = properties.getProperty("mail.password");
            String host = properties.getProperty("mail.host");

            Properties propertiesImap = new Properties();
            propertiesImap.put("mail.store.protocol", "imaps"); //SSL

            Store store = Session.getInstance(propertiesImap).getStore();
            store.connect(host, user, password);

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_WRITE);
            System.out.println("Quantity messages: " + inbox.getMessageCount());
            Message message = inbox.getMessage(inbox.getMessageCount());

        } catch (FileNotFoundException e) {
            System.err.println("Property file isn't exist " + e);
        } catch (IOException e) {
            System.err.println("Trouble reading " + e);
        } catch (NoSuchProviderException e) {
            System.err.println("Trouble provider " + e);
        } catch (MessagingException e) {
            System.err.println("Trouble folder name " + e);
        }
    }
}
