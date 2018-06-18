<template>
  <div class="download-task-panel">

    <edit-task-dialog :taskId="editTaskId" :showDialog="showEditDialog" @closeDialog="showDialog = false"></edit-task-dialog>

    <el-button class="add-task-btn" type="danger" icon="el-icon-plus" circle @click="addTask"></el-button>

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
      <el-table-column label="开始时间" prop="startDate">
      </el-table-column>
      <el-table-column label="结束时间" prop="endDate">
      </el-table-column>
      <el-table-column label="运行周期" prop="runTime">
      </el-table-column>
      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
          <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import EditTaskDialog from './EditTaskDialog'
export default {
  name: 'DownloadTaskList',
  components: { 'edit-task-dialog': EditTaskDialog },
  data() {
    return {
      msg: 'Welcome to Your Vue.js App',
      showEditDialog: false,
      editTaskId: null
    }
  },
  computed: {
    downloadTaskList() {
      return this.$store.state.downloadTaskList.map(downloadTask => {
        return {
          startDate: downloadTask.startDate.toString(),
          endDate: downloadTask.endDate.toString(),
          runTime: downloadTask.runTime + '天',
          taskId: downloadTask.taskId
        }
      })
    }
  },
  methods: {
    handleEdit(index, downloadTask) {
      this.editTaskId = downloadTask.taskId
      this.showDialog = true
    },
    handleDelete(index, downloadTask) {
      console.log('delete task: ' + downloadTask.toString())
    },
    addTask() {
      console.log('add task')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="less">
.download-task-panel {
  height: 100%;
  line-height: auto;
  position: relative;

  .add-task-btn {
    position: absolute;
    z-index: 100;
    bottom: 32px;
    right: 32px;
    width: 56px;
    height: 56px;
    font-size: 28px;
    font-weight: bold;
  }
}
</style>
