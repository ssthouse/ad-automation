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
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
