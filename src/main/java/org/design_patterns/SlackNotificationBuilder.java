package org.design_patterns;

public class SlackNotificationBuilder implements NotificationBuilder{

    private String content;
    private String sender;
    private String recipient;
    private String timestamp;
    private boolean hasMarkDownLanguage;


    @Override
    public SlackNotificationBuilder setContent(String content) {
        this.content=content;
        return this;
    }

    @Override
    public SlackNotificationBuilder setSender(String sender) {
        this.sender=sender;
        return this;
    }

    @Override
    public SlackNotificationBuilder setRecipient(String recipient) {
        this.recipient=recipient;
        return this;
    }

    @Override
    public SlackNotificationBuilder setTimestamp(String timestamp) {
        this.timestamp=timestamp;
        return this;
    }

    public SlackNotificationBuilder setHasMarkDownLanguage(boolean hasMarkDownLanguage) {
        this.hasMarkDownLanguage = hasMarkDownLanguage;
        return this;
    }

    public SlackNotification build(){
        return new SlackNotification(this);
    }

    // getter method

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public boolean isHasMarkDownLanguage() {
        return hasMarkDownLanguage;
    }


}
