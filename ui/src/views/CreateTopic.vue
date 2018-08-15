<template>
  <form data-qa="create-topic-form" @submit.prevent="createTopic">
    <input data-qa="topic-title-input" v-model="topicTitle" />
    <button data-qa="create-topic-button">Submit</button>
  </form>
</template>

<script>
import axios from 'axios'

export default {
  name: 'CreateTopic',
  data () {
    return {
      topicTitle: ''
    }
  },
  methods: {
    createTopic () {
      axios.post(process.env.VUE_APP_BACKEND_URL + 'topics', {
        title: this.topicTitle
      }).then(() => {
        this.$router.push({
          name: 'allTopics'
        })
      })
    }
  }
}
</script>

<style>

</style>
