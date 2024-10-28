# Notification_BuilderDesignPattern

This project demonstrates the **Builder Design Pattern** in a notification system. It allows the creation of different types of notifications (Email, Messenger, and Slack) with customizable fields, ensuring the flexibility to construct complex objects with optional attributes without having to deal with multiple constructors.

## Project Structure

The project is organized into interfaces and classes that represent different notification types and their respective builders.

### 1. `NotificationBuilder` (Interface)
   - Defines the common methods for setting attributes of a notification, such as `setContent`, `setSender`, `setRecipient`, and `setTimestamp`.
   - Implemented by different builders to provide consistent methods for setting properties.

### 2. `EmailNotification`
   - Represents an email notification with fields for content, recipient, timestamp, and sender.
   - **Inner Class:** `EmailNotificationBuilder` is a static inner class that implements `NotificationBuilder`, allowing for the creation of `EmailNotification` objects.
   - Provides a `build()` method that returns a fully constructed `EmailNotification` instance.

### 3. `MessengerNotification`
   - Represents a messenger notification with additional attributes, such as attachments and theme, specific to messenger platforms.
   - **Separate Builder Class:** `MessengerNotificationBuilder` constructs `MessengerNotification` instances, offering additional methods (`setAttachments`, `setTheme`) for messenger-specific properties.

### 4. `SlackNotification`
   - Represents a Slack notification with fields for content, sender, recipient, timestamp, and a special attribute `hasMarkdownLanguage`.
   - **Builder Class:** `SlackNotificationBuilder` provides a custom builder to set `hasMarkdownLanguage` for Slack-specific needs.

### 5. `Main`
   - Demonstrates the use of each builder by creating instances of `MessengerNotification`, `SlackNotification`, and `EmailNotification`.
   - Prints each notification to show the output.

## How It Works

1. **Builder Design Pattern Implementation**:
   - Each notification type uses a builder class that follows the `NotificationBuilder` interface.
   - The builders provide a fluent interface, allowing the setting of properties in a chainable way.
   - When the `build()` method is called, a new notification object is created with the specified properties.

2. **Usage of Builders**:
   - Builders allow optional attributes to be set only when needed, preventing the need for multiple constructors.
   - The `Main` class demonstrates how each builder can be used to create notifications with or without certain optional fields.


## Usage

### Setup

1. Clone the repository and import it into your Java IDE.
2. Compile and run the `Main` class to see the Builder Design Pattern in action.

### Example Code

Here’s an example code snippet demonstrating the system:

```java
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

```


### Sample Output

```plaintext
MessengerNotification{content='Messenger notification content', sender='Messenger notification sender', recipient='Messenger notification recipient', timestamp='Messenger notification timestamp', attachments=[], theme='Messenger notification theme'}
--------------------------------------------
SlackNotification{content='Slack notification content', sender='Slack notification sender', recipient='Slack notification recipient', timestamp='Slack notification timestamp', hasMarkdownLanguage=true}
--------------------------------------------
EmailNotification{content='Email notification content', recipient='Email notification content', timestamp='Email notification content', sender='Email notification content'}
```
