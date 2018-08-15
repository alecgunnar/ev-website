<template>
  <div>
    <router-link :to="{ name: 'createTopic' }" data-qa="create-topic-link">Create Topic</router-link>
    <ol data-qa="topics-list">
      <li v-for="topic in topics" :key="topic.id" data-qa="topic-row">{{ topic.title }}</li>
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

<style>

</style>
