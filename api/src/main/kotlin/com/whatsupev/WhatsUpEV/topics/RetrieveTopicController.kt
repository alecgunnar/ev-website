package com.whatsupev.WhatsUpEV.topics

import com.whatsupev.WhatsUpEV.topics.data.Topic
import com.whatsupev.WhatsUpEV.topics.services.ReadTopicService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RetrieveTopicController(
        var topicService: ReadTopicService
) {
    @CrossOrigin(origins = arrayOf("*"))
    @GetMapping("/topics")
    fun getAllTopics(): List<Topic> {
        return topicService.getAllTopics()
    }
}
