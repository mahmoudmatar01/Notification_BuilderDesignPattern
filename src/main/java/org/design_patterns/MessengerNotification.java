package org.design_patterns;

import java.util.List;

public class MessengerNotification {

    private String content;
    private String sender;
    private String recipient;
    private String timestamp;
    private List<String> attachments;
    private String theme;

     MessengerNotification(MessengerNotificationBuilder builder) {
        this.content = builder.getContent();
        this.sender = builder.getSender();
        this.recipient = builder.getRecipient();
        this.timestamp = builder.getTimestamp();
        this.attachments = builder.getAttachments();
        this.theme = builder.getTheme();
    }

    @Override
    public String toString() {
        return "MessengerNotification{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", attachments=" + attachments +
                ", theme='" + theme + '\'' +
                '}';
    }
}
