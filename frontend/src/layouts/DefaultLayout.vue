<!--
  Layout: DefaultLayout
  Desc: 공통 레이아웃
        - 좌측 사이드바
        - 메인 콘텐츠 영역
        - active 메뉴 강조 UX 포함
-->

<template>
  <div class="default-layout">
    <!-- 사이드바 -->
    <aside class="sidebar">
      <!-- 로고 -->
      <div class="sidebar-header">
        <h1 class="logo">🎟 공연기록</h1>
        <p class="subtitle">Theater Archive System</p>
      </div>

      <!-- 메뉴 -->
      <ul class="menu">
        <li v-for="item in menuItems" :key="item.route">
          <RouterLink
            :to="item.route"
            class="menu-link"
            active-class="router-link-active"
          >
            <component :is="item.icon" class="menu-icon" />
            <span>{{ item.label }}</span>
          </RouterLink>
        </li>
      </ul>
    </aside>

    <!-- 메인 콘텐츠 -->
    <main class="main-content">
      <RouterView />
    </main>
  </div>
</template>

<script setup>
import { RouterView, RouterLink } from 'vue-router'
import {
  Calendar,
  Ticket,
  Theater,
  MapPin,
  Users
} from 'lucide-vue-next'

const menuItems = [
  { label: '메인', icon: Calendar, route: '/main' },
  { label: '관극 기록', icon: Ticket, route: '/viewings' },
  { label: '공연 관리', icon: Theater, route: '/performances' },
  { label: '공연장 관리', icon: MapPin, route: '/venues' },
  { label: '배우 관리', icon: Users, route: '/actors' }
]
</script>

<style scoped>
/* 전체 레이아웃 */
.default-layout {
  display: flex;
  min-height: 100vh;
  background-color: #f9fafb;
}

/* 사이드바 */
.sidebar {
  width: 240px;
  background-color: #f7f8fa;
  border-right: 1px solid #e5e7eb;
  padding: 24px 16px;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
}

/* 로고 */
.sidebar-header {
  text-align: center;
  margin-bottom: 32px;
}

.logo {
  font-size: 20px;
  font-weight: 700;
}

.subtitle {
  font-size: 12px;
  color: #9ca3af;
}

/* 메뉴 */
.menu {
  list-style: none;
  padding: 0;
  margin: 0;
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.menu-link {
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 12px 14px;
  border-radius: 12px;
  text-decoration: none;
  color: #4b5563;
  font-weight: 500;
  transition: background-color 0.15s ease, color 0.15s ease;
}

/* hover */
.menu-link:hover {
  background-color: #eef2ff;
}

/* active */
.menu-link.router-link-active {
  background-color: #f0f4ff;
  color: #3057A3;
  font-weight: 600;
}

/* 아이콘 */
.menu-icon {
  width: 20px;
  height: 20px;
  stroke-width: 1.8;
}

/* active 아이콘 */
.menu-link.router-link-active .menu-icon {
  color: #3057A3;
}

/* 메인 콘텐츠 */
.main-content {
  flex: 1;
  padding: 32px 40px;
  box-sizing: border-box;
}
</style>
