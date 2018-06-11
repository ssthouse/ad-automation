<template>
  <div id="app">
    <vue-progress-bar></vue-progress-bar>
    <router-view id="router-view"></router-view>
  </div>
</template>

<script>
import LoginWithAmazon from './components/LoginWithAmazon'

export default {
  name: 'App',
  components: { LoginWithAmazon },
  data() {
    return {}
  }
}
</script>

<style>
html,
body {
  width: 100%;
  height: 100%;
  margin: 0;
  padding: 0;
}

* {
  box-sizing: border-box;
}

#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  width: 100%;
  height: 100%;
}

#router-view {
  width: 100%;
  height: 100%;
}
</style>
