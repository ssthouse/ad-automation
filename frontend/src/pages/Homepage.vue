<template>
  <div class="homepage">
    <el-carousel indicator-position="outside">
      <el-carousel-item v-for="item in demoImgSrcList" :key="item">
        <div>
          <img :src=item>
          <h3>{{ item }}</h3>
        </div>
      </el-carousel-item>
    </el-carousel>

    <login-with-amazon></login-with-amazon>
  </div>
</template>

<script>
import LoginWithAmazon from '../components/LoginWithAmazon'

export default {
  name: 'homepage',
  components: { 'login-with-amazon': LoginWithAmazon },
  data() {
    return {
      demoImgSrcList: [
        './static/banner1.jpg',
        './static/banner1.jpg',
        './static/banner1.jpg'
      ],
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
