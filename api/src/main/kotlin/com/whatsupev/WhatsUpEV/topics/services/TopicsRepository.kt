package com.whatsupev.WhatsUpEV.topics.services

import com.whatsupev.WhatsUpEV.topics.data.TopicRecord
import org.springframework.data.jpa.repository.JpaRepository

interface TopicsRepository: JpaRepository<TopicRecord, Integer>
