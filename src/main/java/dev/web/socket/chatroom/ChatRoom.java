package dev.web.socket.chatroom;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ChatRoom {
    @Id
    private String id;
    private String chatId;
    private String senderId;
    private String recipientId;


    public ChatRoom(String id, String chatId, String senderId, String recipientId) {
        this.id = id;
        this.chatId = chatId;
        this.senderId = senderId;
        this.recipientId = recipientId;
    }

    public ChatRoom() {
    }

    public static ChatRoomBuilder builder() {
        return new ChatRoomBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public String getRecipientId() {
        return this.recipientId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatRoom)) return false;
        final ChatRoom other = (ChatRoom) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$chatId = this.getChatId();
        final Object other$chatId = other.getChatId();
        if (this$chatId == null ? other$chatId != null : !this$chatId.equals(other$chatId)) return false;
        final Object this$senderId = this.getSenderId();
        final Object other$senderId = other.getSenderId();
        if (this$senderId == null ? other$senderId != null : !this$senderId.equals(other$senderId)) return false;
        final Object this$recipientId = this.getRecipientId();
        final Object other$recipientId = other.getRecipientId();
        if (this$recipientId == null ? other$recipientId != null : !this$recipientId.equals(other$recipientId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatRoom;
    }


    public static class ChatRoomBuilder {
        private String id;
        private String chatId;
        private String senderId;
        private String recipientId;

        ChatRoomBuilder() {
        }

        public ChatRoomBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ChatRoomBuilder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        public ChatRoomBuilder senderId(String senderId) {
            this.senderId = senderId;
            return this;
        }

        public ChatRoomBuilder recipientId(String recipientId) {
            this.recipientId = recipientId;
            return this;
        }

        public ChatRoom build() {
            return new ChatRoom(this.id, this.chatId, this.senderId, this.recipientId);
        }

    }
}
