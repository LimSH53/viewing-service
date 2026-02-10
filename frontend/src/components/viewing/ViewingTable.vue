<!--
  Component: ViewingTable
  Desc: 관극 기록 목록을 테이블 형태로 출력
        Columns:
        - 관람일자
        - 공연명
        - 공연장
        - 캐스트 요약
-->
<template>
  <table class="viewing-table">
    <thead>
      <tr>
        <th><input type="checkbox" /></th>
        <th>일자</th>
        <th>공연명</th>
        <th>공연장</th>
        <th>좌석</th>
        <th>주연</th>
      </tr>
    </thead>
    <tbody>
      <!-- rows -->
    </tbody>
  </table>
</template>

<script setup>

</script>

<style scoped>
.viewing-table {
  width: 100%;
  border-collapse: collapse;
  background-color: #ffffff;
  border-radius: 12px;
  overflow: hidden;
}

.viewing-table th,
.viewing-table td {
  padding: 14px 12px;
  border-bottom: 1px solid #e5e7eb;
  text-align: left;
  font-size: 14px;
}

.viewing-table th {
  color: #6b7280;
  font-weight: 600;
}

.viewing-table tbody tr:hover {
  background-color: #f9fafb;
}

</style>