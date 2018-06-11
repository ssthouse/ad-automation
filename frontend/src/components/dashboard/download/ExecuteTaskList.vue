<template>
  <div class="execute-task-panel">
    <div v-for="(task, index) in this.$store.state.downloadTaskList" :key="index">
      <span>{{task.toString()}}</span>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ExecuteTaskList',
  data() {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
