<template>
  <div class="app-layout">
    <aside class="sidebar">
      <h2>공연 기록</h2>
      <nav>
        <ul>
          <li>
            <RouterLink to="/viewings">관극 기록</RouterLink>
          </li>
        </ul>
      </nav>
    </aside>

    <main class="content">
      <RouterView />
    </main>
  </div>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<style scoped>
.app-layout {
  display: flex;
  height: 100vh;
  min-height: 100vh;
}
.sidebar {
  width: 240px;
  background-color: #2c3e50;
  color: white;
  padding: 24px;
}

/* 본문 */
.content {
  flex: 1;
  padding: 40px;
}
</style>
