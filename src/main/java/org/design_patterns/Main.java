package org.design_patterns;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        MessengerNotification messengerNotification = new MessengerNotificationBuilder()
                .setContent("Messenger notification content")
                .setRecipient("Messenger notification recipient")
                .setSender("Messenger notification sender")
                .setTheme("Messenger notification theme")
                .setTimestamp("Messenger notification timestamp")
                .setAttachments(new ArrayList<>())
                .build();
        System.out.println(messengerNotification.toString());

        System.out.println("--------------------------------------------");

        SlackNotification slackNotification = new SlackNotificationBuilder()
                .setContent("Slack notification content")
                .setRecipient("Slack notification recipient")
                .setSender("Slack notification sender")
                .setTimestamp("Slack notification timestamp")
                .setHasMarkDownLanguage(true)
                .build();
        System.out.println(slackNotification.toString());

        System.out.println("--------------------------------------------");

        EmailNotification emailNotification = new EmailNotification.EmailNotificationBuilder()
                .setContent("Email notification content")
                .setSender("Email notification content")
                .setRecipient("Email notification content")
                .setTimestamp("Email notification content")
                .build();
        System.out.println(emailNotification.toString());
    }
}