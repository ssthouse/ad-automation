<template>
  <div id="download-panel">
    <el-row>
      <download-task></download-task>
    </el-row>
    <el-row>
      download task detail
    </el-row>
  </div>
</template>

<script>
import DownloadTask from './DownloadTask'

export default {
  name: 'Download',
  components: { 'download-task': DownloadTask },
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
