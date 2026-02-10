<!--
  Component: ViewingSearch
  Desc: 관극 기록 목록 검색 영역
        - 날짜 / 공연명 / 공연장 등 조건 입력
        - 검색 조건 변경 시 목록 조회 API와 연동 예정
-->
<template>
  <div class="viewing-search">
    <div class="search-field">
      <label>날짜</label>
      <input type="date" />
    </div>

    <div class="search-field">
      <label>공연명</label>
      <input type="text" placeholder="공연명을 입력하세요" />
    </div>

    <div class="search-field">
      <label>배우</label>
      <input type="text" placeholder="배우 이름" />
    </div>

    <button class="btn-search">검색</button>
  </div>
</template>

<style scoped>
.viewing-search {
  display: grid;
  grid-template-columns: 1fr 2fr 1fr auto;
  gap: 16px;
  padding: 20px;
  background-color: #f3f4f6;
  border-radius: 12px;
  box-shadow: 0 1px 4px rgba(0,0,0,0.05);
  margin-bottom: 24px;
}

.viewing-search input {
  height: 42px;
  padding: 0 12px;
  border: none;
  border-radius: 8px;
  background-color: #ffffff;
  font-size: 14px;
  box-sizing: border-box;
}

.viewing-search input:focus {
  outline: none;
  box-shadow: inset 0 0 0 1px #d1d5db;
  background-color: #ffffff;
}

.viewing-search input[type="date"] {
  appearance: none;
  -webkit-appearance: none;
  color: #6b7280;
}
.search-field {
  display: flex;
  text-align: left;
  flex-direction: column;
}

.search-field label {
  font-size: 12px;
  color: #6b7280;
  margin-bottom: 4px;
}

.btn-search {
  align-self: flex-end;
  height: 40px;
  padding: 0 20px;
  background-color: #374151;
  color: #fff;
  border-radius: 8px;
}

</style>
