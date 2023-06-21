package com.example.allknightrapp.presentation.chat

import com.example.allknightrapp.domain.model.Message
import java.util.Collections.emptyList

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
