<template>
  <div class="download-task-panel">
    <div v-for="task in this.$store.state.downloadTaskList" :key="task.taskId">
      {{task.toString()}}
    </div>
  </div>
</template>

<script>
export default {
  name: 'DownloadTask',
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
.download-task-panel {
  height: auto;
  line-height: auto;
}
</style>
