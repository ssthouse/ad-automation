<template>
  <div class="download-task-panel">

    <el-table :data="downloadTaskList" style="width: 100%">
      <el-table-column type="expand">
        <template slot-scope="props">
          <el-form label-position="left" inline class="demo-table-expand">
            <el-form-item label="Start Date">
              <span>{{ props.row.startDate }}</span>
            </el-form-item>
            <el-form-item label="End Date">
              <span>{{ props.row.endDate }}</span>
            </el-form-item>
          </el-form>
        </template>
      </el-table-column>
      <el-table-column label="商品 ID" prop="startDate">
      </el-table-column>
      <el-table-column label="商品名称" prop="endDate">
      </el-table-column>
      <el-table-column label="描述" prop="description">
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'DownloadTaskList',
  data() {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  computed: {
    downloadTaskList() {
      return this.$store.state.downloadTaskList.map(downloadTask => {
        downloadTask.startDate = downloadTask.startDate.toString()
        downloadTask.endDate = downloadTask.endDate.toString()
        return downloadTask
      })
    }
  },
  methods: {}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.download-task-panel {
  height: auto;
  line-height: auto;
}
</style>
