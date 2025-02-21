package com.ll.sbrabbitmq.domain.chat.chat.repository;

import com.ll.sbrabbitmq.domain.chat.chat.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByChatRoomId(long roomId);
}
