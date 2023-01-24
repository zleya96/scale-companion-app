<template>
  <div class="home">
    <ScaleHome msg="Welcome to Scale Companion"/>
  </div>
</template>

<script>
// @ is an alias to /src
import ScaleHome from '@/components/ScaleHome.vue';

export default {
  name: 'HomeView',
  components: {
    ScaleHome
  },
  created() {
    this.$store.commit("SET_ALL_SCALES");
  }
}
</script>
