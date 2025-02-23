package dev.web.socket.chatroom;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatRoomService {

    private final ChatRoomRepository repository;

    public ChatRoomService(ChatRoomRepository repository) {
        this.repository = repository;
    }

    public Optional<String> getChatRoomId(String senderId,
                                          String recipientId,
                                          boolean createNewChatRoomIfNotExists
    ) {
        return repository
                .findBySenderIdAndRecipientId(senderId, recipientId)
                .map(ChatRoom::getChatId)
                .or(() -> {
                    if (createNewChatRoomIfNotExists) {
                        var chatId = createId(senderId, recipientId);
                        return Optional.of(chatId);
                    }
                    return Optional.empty();

                });
    }

    private String createId(String senderId, String recipientId) {
        var chatId = String.format("%s_%s", senderId, recipientId);

        ChatRoom senderRecipient = ChatRoom
                .builder()
                .chatId(chatId)
                .senderId(senderId)
                .recipientId(recipientId)
                .build();

        ChatRoom recipientSender = ChatRoom
                .builder()
                .chatId(chatId)
                .senderId(recipientId)
                .recipientId(senderId)
                .build();

        repository.save(senderRecipient);
        repository.save(recipientSender);

        return chatId;
    }
}
