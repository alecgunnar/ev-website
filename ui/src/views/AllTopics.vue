<template>
  <div>
    <p><router-link :to="{ name: 'createTopic' }" data-qa="create-topic-link">Create Topic</router-link></p>
    <ol data-qa="topics-list" class="topicsList">
      <li v-for="topic in topics" :key="topic.id" data-qa="topic-row" class="topicsList__topic">{{ topic.title }}</li>
    </ol>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'AllTopics',
  data () {
    return {
      topics: []
    }
  },
  mounted () {
    axios.get(process.env.VUE_APP_BACKEND_URL + 'topics').then((response) => {
      this.topics = response.data
    })
  }
}
</script>

<style lang="scss" scoped>
.topicsList {
  list-style: none;
  margin: 0;
  padding: 0;
}

.topicsList__topic {
  background-color: #FAFAFA;
  margin: 0 0 20px 0;
  padding: 10px;
}
</style>
