import { createRouter, createWebHistory } from 'vue-router'
import DefaultLayout from  '../layouts/DefaultLayout.vue'
import ViewingListView from '../views/ViewingListView.vue'

const routes = [
  {
    path: '/',
    component: DefaultLayout,
    children: [
      {
        path: '',
        redirect: '/viewings'
      },
      {
        path: 'viewings',
        name: 'ViewingList',
        component: ViewingListView
      }
    ]
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
