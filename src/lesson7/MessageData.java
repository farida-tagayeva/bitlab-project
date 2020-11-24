package lesson7;

import java.util.Date;

public class MessageData {
      private String userName;
      private String messageText;
      private Date sentDate; // java.util.Date

    public MessageData() {
    }

    public MessageData(String userName, String messageText, Date sentDate) {
        this.userName = userName;
        this.messageText = messageText;
        this.sentDate = sentDate;
    }


}
