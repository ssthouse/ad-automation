<template>
  <div id="dashboard-header">
    <div id="context-menu">
      <el-dropdown trigger="click" size="medium">
        <div id="menu-button">
          <span class="username-label">username</span>
          <i class="el-icon-caret-bottom"></i>
        </div>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>黄金糕</el-dropdown-item>
          <el-dropdown-item>狮子头</el-dropdown-item>
          <el-dropdown-item>螺蛳粉</el-dropdown-item>
          <el-dropdown-item>双皮奶</el-dropdown-item>
          <el-dropdown-item>蚵仔煎</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
export default {
  name: 'DashboardHeader',
  props: [],
  data() {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    logOut() {
      // eslint-disable-next-line
      amazon.Login.logout()
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="less">
#dashboard-header {
  width: 100%;
  height: 54px;
  padding: 0 16px 0 16px;
  display: flex;
  position: relative;
  background-color: #eee;

  #context-menu {
    height: 100%;
    width: 100px;
    position: absolute;
    right: 0;
    top: 0;
  }

  #menu-button {
    display: flex;
    justify-content: center;
    align-items: center;
    cursor: pointer;

    .username-label {
      font-size: 1.2rem;
      color: grey;
    }
  }
}
</style>
