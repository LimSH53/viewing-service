import { createRouter, createWebHistory } from 'vue-router'
import ViewingListView from '../views/ViewingListView.vue'

const routes = [
  {
    path: '/',
    redirect: '/viewings'
  },
  {
    path: '/viewings',
    name: 'ViewingList',
    component: ViewingListView
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
