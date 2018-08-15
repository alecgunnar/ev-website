package com.whatsupev.WhatsUpEV.topics.services

import com.whatsupev.WhatsUpEV.topics.data.CreateTopicRequest
import com.whatsupev.WhatsUpEV.topics.data.Topic
import com.whatsupev.WhatsUpEV.topics.data.TopicRecord
import org.springframework.stereotype.Service

@Service
class CreateTopicService(
        val topicsRepository: TopicsRepository
) {
    fun createTopicFromRequest(createTopicRequest: CreateTopicRequest): Topic {
        val createdTopic = topicsRepository.save(
                TopicRecord(title = createTopicRequest.title)
        )

        return Topic(createdTopic.title, createdTopic.id)
    }
}
