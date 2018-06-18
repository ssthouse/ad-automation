<template>
  <el-dialog title="提示" :visible.sync="showDialog" width="50%" :showClose="false">
    <span>编辑任务</span>
    <span slot="footer" class="dialog-footer">
      <el-button @click="closeDialog">取 消</el-button>
      <el-button type="primary" @click="ensureEdit">确 定</el-button>
    </span>
  </el-dialog>
</template>

<script>
export default {
  name: 'edit-task-dialog',
  event: 'closeDialog',
  props: ['taskId', 'showDialog'],
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
    ensureEdit() {
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
