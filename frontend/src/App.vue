<template>
  <div id="app">
    <login-with-amazon></login-with-amazon>
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
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
