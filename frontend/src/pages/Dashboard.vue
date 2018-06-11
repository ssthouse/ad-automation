<template>
  <div class="dashboard">
    <el-container id="dashboard-container">

      <el-header>Header</el-header>

      <el-container>
        <el-aside width="200px">
          <side-menu id="side-menu" baseUrl="/dashboard"></side-menu>
        </el-aside>
        <el-container>
          <el-main>
            <router-view></router-view>
          </el-main>
        </el-container>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import SideMenu from '../components/dashboard/SideMenu'

export default {
  name: 'dashboard',
  components: { 'side-menu': SideMenu },
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
.el-header,
.el-footer {
  background-color: #b3c0d1;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  background-color: #d3dce6;
  color: #333;
  text-align: center;
  line-height: 200px;
}

.el-main {
  background-color: #e9eef3;
  color: #333;
  text-align: center;
  line-height: 160px;
}

body > .el-container {
  margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}

#dashboard-container {
  width: 100%;
  height: 100%;
}
</style>
