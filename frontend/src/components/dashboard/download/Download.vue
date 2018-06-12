<template>
  <el-container id="download-panel">
    <el-aside width="200px">
      <el-menu class="side-menu" :router="true">
        <el-menu-item :index="baseUrl + '/download' + '/taskList'">
          <i class="el-icon-menu"></i>
          <span slot="title">Task List</span>
        </el-menu-item>
        <el-menu-item :index="baseUrl + '/download' + '/executeList'">
          <i class="el-icon-document"></i>
          <span slot="title">Execute List</span>
        </el-menu-item>
      </el-menu>
    </el-aside>

    <el-main id="download-content">
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: 'Download',
  props: ['baseUrl'],
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
  text-align: left;
}

#download-content {
  padding: 0;
}
</style>
