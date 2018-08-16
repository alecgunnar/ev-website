<template>
  <div>
    <form data-qa="create-topic-form" @submit.prevent="createTopic" class="form">
      <div class="form__inputRow">
        <label for="topic-title">Topic Title</label>
        <input data-qa="topic-title-input" id="topic-title" v-model="topicTitle" />
      </div>
      <div class="form__buttonRow">
        <button data-qa="create-topic-button">Submit</button>
      </div>
    </form>
  </div>
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

<style lang="scss" scoped>
.form {

}

.form__inputRow {
  margin: 0 0 20px;

  label {
    display: block;
    margin: 0 0 5px;
  }

  input {
    padding: 5px;
  }
}

.form__buttonRow {

}
</style>
