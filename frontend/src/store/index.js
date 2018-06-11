import Vuex from 'vuex'
import Vue from 'vue'
import DownloadTask from './bean/DownloadTask'

Vue.use(Vuex)

const store = new Vuex.Store({
  state: {
    downloadTaskList: [new DownloadTask(), new DownloadTask()]
  },
  mutations: {
    updateDownloadTaskList(state, newTaskList) {
      if (newTaskList === undefined) {
        return
      }
      state.downloadTaskList = newTaskList
    }
  }
})

export default store
