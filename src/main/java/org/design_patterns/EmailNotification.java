package org.design_patterns;

public class EmailNotification {

    private String content;
    private String recipient;
    private String timestamp;
    private String sender;

    private EmailNotification(EmailNotificationBuilder builder) {
        this.content = builder.getContent();
        this.recipient = builder.getRecipient();
        this.timestamp = builder.getTimestamp();
        this.sender = builder.getSender();

    }

    @Override
    public String toString() {
        return "EmailNotification{" +
                "content='" + content + '\'' +
                ", recipient='" + recipient + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }

    public static class EmailNotificationBuilder implements NotificationBuilder {

        private String content;
        private String recipient;
        private String timestamp;
        private String sender;

        public String getContent() {
            return content;
        }

        public String getRecipient() {
            return recipient;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public String getSender() {
            return sender;
        }

        @Override
        public EmailNotificationBuilder setContent(String content) {
            this.content=content;
            return this;
        }

        @Override
        public EmailNotificationBuilder setSender(String sender) {
            this.sender=sender;
            return this;
        }

        @Override
        public EmailNotificationBuilder setRecipient(String recipient) {
            this.recipient=recipient;
            return this;
        }

        @Override
        public EmailNotificationBuilder setTimestamp(String timestamp) {
            this.timestamp=timestamp;
            return this;
        }

        public EmailNotification build() {
            return new EmailNotification(this);
        }
    }
}
