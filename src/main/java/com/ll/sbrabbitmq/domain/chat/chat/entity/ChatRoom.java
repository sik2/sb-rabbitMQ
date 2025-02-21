package com.ll.sbrabbitmq.domain.chat.chat.entity;

import com.ll.sbrabbitmq.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Getter
@Setter
public class ChatRoom extends BaseEntity {
    private String name;
}
