module.exports = {
  'creating a topic': browser => {
    browser
      .url(process.env.VUE_DEV_SERVER_URL + '#/all-topics')

      .click('[data-qa=create-topic-link]')

      .assert.urlEquals(process.env.VUE_DEV_SERVER_URL + '#/create-topic')
      .setValue('[data-qa=topic-title-input]', 'Sample Topic')
      .click('[data-qa=create-topic-button]')

      .waitForElementNotPresent('[data-qa=create-topic-form]', 2000)

      .assert.urlEquals(process.env.VUE_DEV_SERVER_URL + '#/all-topics')
      .assert.containsText('[data-qa=topic-row]:last-of-type', 'Sample Topic')

      .end()
  }
}
