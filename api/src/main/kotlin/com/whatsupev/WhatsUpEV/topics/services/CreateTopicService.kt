package com.whatsupev.WhatsUpEV.topics.services

import com.whatsupev.WhatsUpEV.topics.data.CreateTopicRequest
import com.whatsupev.WhatsUpEV.topics.data.Topic

class CreateTopicService(
        val topicsRepository: TopicsRepository
) {
    fun createTopicFromRequest(createTopicRequest: CreateTopicRequest): Topic {
        return Topic(createTopicRequest.title, 1)
    }
}
