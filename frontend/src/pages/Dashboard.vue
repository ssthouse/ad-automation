<template>
  <div class="dashboard">
    Dashboard
    <el-button @click="test"></el-button>
  </div>
</template>

<script>
export default {
  name: 'dashboard',
  components: {},
  data() {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    test() {
      this.$Progress.start()
      setTimeout(() => {
        this.$Progress.finish()
      }, 2000)
    },
    fetchCustomerInfo() {
      this.$Progress.start()
      this.$http
        .get('/customerInfo/testAmazonId1')
        .then(userInfo => {
          console.log(userInfo)
          this.$Progress.finish()
        })
        .catch(error => {
          console.log(error)
          this.$Progress.fail()
        })
    }
  },
  created() {
    this.fetchCustomerInfo()
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
