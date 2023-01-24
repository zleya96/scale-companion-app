<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <table>
      <thead>
        <tr>
          <th>Name</th>
          <th>Notes</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="scale in this.$store.state.allScales" v-bind:key="scale.scale_id">
          <td>{{ scale.root }} {{ scale.type }}</td>
          <td> {{ scale.notes }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'ScaleHome',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
