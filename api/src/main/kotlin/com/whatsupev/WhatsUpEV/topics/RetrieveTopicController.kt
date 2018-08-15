package com.whatsupev.WhatsUpEV.topics

import com.whatsupev.WhatsUpEV.topics.data.Topic
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class RetrieveTopicController {
    @GetMapping("/topics")
    fun getAllTopics(): List<Topic> {
        return Collections.emptyList()
    }
}
