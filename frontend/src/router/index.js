import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '@/pages/Homepage'
import Dashboard from '@/pages/Dashboard'
import Download from '@/components/dashboard/Download'

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
          component: Download
        }
      ]
    }
  ]
})
