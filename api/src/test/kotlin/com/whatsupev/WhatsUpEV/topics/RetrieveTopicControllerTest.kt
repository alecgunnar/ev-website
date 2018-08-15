package com.whatsupev.WhatsUpEV.topics

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.whatsupev.WhatsUpEV.topics.data.Topic
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class RetrieveTopicControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun retrievesAllTopics() {
        val createdTopic = createTopicWithTitle("Sample Topic")

        val allTopicsResponse = mockMvc.perform(get("/topics"))
                .andExpect(status().isOk)
                .andReturn().response.contentAsString

        val allTopics: List<Topic> = jacksonObjectMapper().readValue(allTopicsResponse, object : TypeReference<List<Topic>>() {})

        assertThat(allTopics).containsOnly(createdTopic)
    }

    private fun createTopicWithTitle(topicTitle: String): Topic {
        val createdTopicResponse = mockMvc.perform(post("/topics").param("title", topicTitle))
                .andExpect(status().isOk)
                .andReturn().response.contentAsString

        return jacksonObjectMapper().readValue(createdTopicResponse, Topic::class.java)
    }
}