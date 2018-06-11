<template>
  <el-container id="download-panel">
    <el-aside width="200px">
      <el-menu class="side-menu">
        <el-menu-item index="0">
          <i class="el-icon-menu"></i>
          <span slot="title">Task List</span>
        </el-menu-item>
        <el-menu-item index="1">
          <i class="el-icon-document"></i>
          <span slot="title">Execute Detail</span>
        </el-menu-item>
      </el-menu>
    </el-aside>

    <el-main>
      <el-row>
        <download-task></download-task>
      </el-row>
      <el-row>
        download task detail
      </el-row>
    </el-main>
  </el-container>
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
.side-menu {
  height: 100%;
}
</style>
