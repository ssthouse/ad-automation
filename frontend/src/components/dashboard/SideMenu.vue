<template>
  <el-menu :router="true" default-active="2" :collapse="true" class="side-menu" background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
    <el-submenu index="1">
      <template slot="title">
        <i class="el-icon-location"></i>
        <span>导航一</span>
      </template>
      <el-menu-item-group>
        <template slot="title">分组一</template>
        <el-menu-item index="1-1">选项1</el-menu-item>
        <el-menu-item index="1-2">选项2</el-menu-item>
      </el-menu-item-group>
      <el-menu-item-group title="分组2">
        <el-menu-item index="1-3">选项3</el-menu-item>
      </el-menu-item-group>
    </el-submenu>

    <el-menu-item :index="baseUrl + '/download'">
      <i class="el-icon-menu"></i>
      <span slot="title">Download</span>
    </el-menu-item>
    <el-menu-item index="4">
      <i class="el-icon-setting"></i>
      <span slot="title">导航四</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
export default {
  name: 'SideMenu',
  props: ['baseUrl'],
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
<style scoped>
.side-menu {
  height: 100%;
}
</style>
