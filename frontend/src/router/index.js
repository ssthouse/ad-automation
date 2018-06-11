import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '@/pages/Homepage'
import Dashboard from '@/pages/Dashboard'
import Download from '@/components/dashboard/download/Download'
import DownloadTaskList from '@/components/dashboard/download/DownloadTaskList'
import ExecuteTaskList from '@/components/dashboard/download/ExecuteTaskList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/homepage',
      name: 'homepage',
      component: Homepage
    },
    {
      path: '/dashboard',
      name: 'dashboard',
      component: Dashboard,
      children: [
        {
          path: 'download',
          component: Download,
          children: [
            {
              path: 'taskList',
              component: DownloadTaskList
            },
            {
              path: 'executeList',
              component: ExecuteTaskList
            }
          ]
        }
      ]
    }
  ]
})
