package com.whatsupev.WhatsUpEV.topics.services

import com.whatsupev.WhatsUpEV.topics.data.Topic
import org.springframework.stereotype.Service

@Service
class ReadTopicService(
        val topicsRepository: TopicsRepository
) {
    fun getAllTopics (): List<Topic> {
        return topicsRepository.findAll().map { topicRecord -> Topic(topicRecord.title, topicRecord.id) }
    }
}