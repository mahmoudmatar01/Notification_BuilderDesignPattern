package org.design_patterns;

public class SlackNotification {

    private String content;
    private String sender;
    private String recipient;
    private String timestamp;
    private boolean hasMarkDownLanguage;

    SlackNotification(SlackNotificationBuilder builder) {
        this.content = builder.getContent();
        this.sender = builder.getSender();
        this.recipient = builder.getRecipient();
        this.timestamp = builder.getTimestamp();
        this.hasMarkDownLanguage = builder.isHasMarkDownLanguage();
    }

    @Override
    public String toString() {
        return "SlackNotification{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", hasMarkDownLanguage=" + hasMarkDownLanguage +
                '}';
    }
}
