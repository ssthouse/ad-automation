<template>
  <div class="dashboard">
    <el-container id="dashboard-container">

      <el-header>Header</el-header>

      <el-container>
        <el-aside width="auto">
          <side-menu id="side-menu" baseUrl="/dashboard"></side-menu>
        </el-aside>
        <el-container>
          <el-main id="dashboard-main">
            <router-view id="dashboard-content" :baseUrl="baseUrl"></router-view>
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
      msg: 'Welcome to Your Vue.js App',
      baseUrl: '/dashboard'
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

.el-main {
  background-color: #e9eef3;
  color: #333;
  text-align: center;
  line-height: 160px;
}

body > .el-container {
  margin-bottom: 40px;
}

#dashboard-main {
  padding: 0;
}

#dashboard-content {
  height: 100%;
}

#dashboard-container {
  width: 100%;
  height: 100%;
}
</style>
