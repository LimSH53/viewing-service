<!--
  Page: 관극 기록 목록
  Desc: 관극 기록을 한 페이지에서 조회·검색·등록하기 위한 메인 화면
        - 검색 영역
        - 관극 기록 테이블
        - 등록 버튼 및 등록 팝업 진입점 역할
-->
<template>
  <div class="viewing-list-view">
    <!-- 페이지 헤더 -->
    <section class="page-header">
      <h1>관극 기록</h1>
      <p>소중한 공연의 추억을 기록하고 관리하세요.</p>
    </section>

    <!-- 검색 -->
    <ViewingSearch />

    <!-- 테이블 -->
    <ViewingTable />

    <!-- 하단 버튼 -->
    <div class="action-bar">
      <button class="btn-delete">선택 삭제</button>
      <button class="btn-primary">+ 새 기록 등록</button>
    </div>
  </div>
</template>


<script setup>
import ViewingSearch from '../components/viewing/ViewingSearch.vue'
import ViewingTable from '../components/viewing/ViewingTable.vue'
</script>

<style scoped>
/* .viewing-list-view {
  max-width: 1200px;
  
} */

.page-header {
  text-align: left;
  margin-bottom: 24px;
}

.page-header h1 {
  font-size: 24px;
  font-weight: 700;
}

.page-header p {
  margin-top: 4px;
  color: #6b7280;
  font-size: 14px;
}

.action-bar {
  display: flex;
  justify-content: flex-end;
  gap: 12px;
  margin-top: 20px;
}

.btn-delete {
  background-color: #fff;
  border: 1px solid #fca5a5;
  color: #ef4444;
  /* padding: 10px 16px; */
  border-radius: 8px;
  height: 40px;
  padding: 0 20px;
}

.btn-primary {
  background-color: #374151;
  color: #fff;
  /* padding: 10px 18px; */
  border-radius: 8px;
  height: 40px;
  padding: 0 20px;
}

</style>
