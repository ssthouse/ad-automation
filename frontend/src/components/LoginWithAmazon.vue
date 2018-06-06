<template>
  <div class="hello">
    <a href="#" id="LoginWithAmazon" @click="login">
      <img border="0" alt="Login with Amazon" src="https://images-na.ssl-images-amazon.com/images/G/01/lwa/btnLWA_gold_156x32.png" width="156" height="32" />
    </a>
    <a id="Logout" @click="logOut">Logout</a>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    login() {
      const options = { scope: 'profile' }
      // eslint-disable-next-line
      amazon.Login.authorize(options, 'https://valen.site/signup')
    },
    logOut() {
      // eslint-disable-next-line
      amazon.Login.logout()
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
