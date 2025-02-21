package com.ll.sbrabbitmq.domain.chat.chat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ll.sbrabbitmq.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;


@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
public class ChatMessage extends BaseEntity {
    @ManyToOne
    @JsonIgnore
    private ChatRoom chatRoom;
    private String writerName;
    private String body;
}
