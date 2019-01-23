package com.serkaneren.chatexample.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Chat message
 *
 * @author eren
 */
@Data
@NoArgsConstructor
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;
}
