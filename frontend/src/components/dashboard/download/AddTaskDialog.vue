<template>
  <el-dialog title="提示" :visible.sync="showDialog" width="50%" :showClose="false">
    <span>添加任务</span>
    <span slot="footer" class="dialog-footer">
      <el-button @click="closeDialog">取 消</el-button>
      <el-button type="primary" @click="ensureAdd">确 定</el-button>
    </span>
  </el-dialog>
</template>

<script>
export default {
  name: 'add-task-dialog',
  event: 'closeDialog',
  props: ['showDialog'],
  data() {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  methods: {
    handleClose() {},
    closeDialog() {
      this.$emit('closeDialog')
    },
    ensureAdd() {
      // TODO dislpathc action!
      this.closeDialog()
    }
  }
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
