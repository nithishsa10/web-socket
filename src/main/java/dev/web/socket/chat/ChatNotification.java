package dev.web.socket.chat;

public class ChatNotification {
    private String id;
    private String senderId;
    private String recipientId;
    private String content;

    public ChatNotification(String id, String senderId, String recipientId, String content) {
        this.id = id;
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.content = content;
    }

    public ChatNotification() {
    }

    public static ChatNotificationBuilder builder() {
        return new ChatNotificationBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public String getRecipientId() {
        return this.recipientId;
    }

    public String getContent() {
        return this.content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChatNotification)) return false;
        final ChatNotification other = (ChatNotification) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$senderId = this.getSenderId();
        final Object other$senderId = other.getSenderId();
        if (this$senderId == null ? other$senderId != null : !this$senderId.equals(other$senderId)) return false;
        final Object this$recipientId = this.getRecipientId();
        final Object other$recipientId = other.getRecipientId();
        if (this$recipientId == null ? other$recipientId != null : !this$recipientId.equals(other$recipientId))
            return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChatNotification;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $senderId = this.getSenderId();
        result = result * PRIME + ($senderId == null ? 43 : $senderId.hashCode());
        final Object $recipientId = this.getRecipientId();
        result = result * PRIME + ($recipientId == null ? 43 : $recipientId.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    public String toString() {
        return "ChatNotification(id=" + this.getId() + ", senderId=" + this.getSenderId() + ", recipientId=" + this.getRecipientId() + ", content=" + this.getContent() + ")";
    }

    public static class ChatNotificationBuilder {
        private String id;
        private String senderId;
        private String recipientId;
        private String content;

        ChatNotificationBuilder() {
        }

        public ChatNotificationBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ChatNotificationBuilder senderId(String senderId) {
            this.senderId = senderId;
            return this;
        }

        public ChatNotificationBuilder recipientId(String recipientId) {
            this.recipientId = recipientId;
            return this;
        }

        public ChatNotificationBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ChatNotification build() {
            return new ChatNotification(this.id, this.senderId, this.recipientId, this.content);
        }

        public String toString() {
            return "ChatNotification.ChatNotificationBuilder(id=" + this.id + ", senderId=" + this.senderId + ", recipientId=" + this.recipientId + ", content=" + this.content + ")";
        }
    }
}
