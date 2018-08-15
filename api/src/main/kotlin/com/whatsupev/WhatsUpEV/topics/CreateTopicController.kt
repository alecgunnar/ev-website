package com.whatsupev.WhatsUpEV.topics

import com.whatsupev.WhatsUpEV.topics.data.CreateTopicRequest
import com.whatsupev.WhatsUpEV.topics.data.Topic
import com.whatsupev.WhatsUpEV.topics.services.CreateTopicService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CreateTopicController(
        val createTopicService: CreateTopicService
) {
    @CrossOrigin(origins = arrayOf("*"))
    @PostMapping("/topics")
    fun createTopic(
            @RequestBody createTopicRequest: CreateTopicRequest
    ): Topic {
        return createTopicService.createTopicFromRequest(createTopicRequest)
    }
}
