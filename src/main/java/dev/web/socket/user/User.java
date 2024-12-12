package dev.web.socket.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;

    public String getNickName() {
        return this.nickName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
