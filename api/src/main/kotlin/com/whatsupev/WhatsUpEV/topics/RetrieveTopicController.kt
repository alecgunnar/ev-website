package com.whatsupev.WhatsUpEV.topics

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class RetrieveTopicController {
    @GetMapping("/topics")
    fun getAllTopics(): List<TopicData> {
        return Arrays.asList(
                TopicData("How do I charge my vehicle", 123)
        )
    }
}
