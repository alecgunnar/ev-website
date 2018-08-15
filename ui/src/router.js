import Vue from 'vue'
import Router from 'vue-router'

import Home from './views/Home.vue'
import AllTopics from './views/AllTopics.vue'
import CreateTopic from './views/CreateTopic.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },

    {
      path: '/all-topics',
      name: 'allTopics',
      component: AllTopics
    },
    {
      path: '/create-topic',
      name: 'createTopic',
      component: CreateTopic
    }
  ]
})
