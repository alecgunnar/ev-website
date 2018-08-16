<template>
  <div id="app">
    <header class="branding">
      What's Up EV?
    </header>
    <router-view/>
  </div>
</template>

<style lang="scss">
html {
  font-size: 10px;
}

body {
  margin: 0;
  padding: 20px;
}

#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}

.branding {
  font-weight: bold;
  font-size: 4rem;
  margin: 0 0 20px;
}

p, ol, ul, label, input, select, button {
  font-size: 2rem;
}

input {
  outline: none;
}
</style>
