<template>
  <ul>
    <li v-for="v in items" :key="v.id">
      {{ v.performanceName }} - {{ v.viewingDate }}
    </li>
  </ul>
</template>

<script setup>
defineProps({
  items: Array
})
</script>