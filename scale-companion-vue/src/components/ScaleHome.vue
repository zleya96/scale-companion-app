<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <div class="select">
      <label for="root-selector">Root </label>
      <select name="root-selector" id="root-selector" v-model="root">
        <option value="All">All Roots</option>
        <option value="Ab">Ab</option>
        <option value="A">A</option>
        <option value="Bb">Bb</option>
        <option value="B">B</option>
        <option value="Cb">Cb</option>
        <option value="C" selected>C</option>
        <option value="C#">C#</option>
        <option value="Db">Db</option>
        <option value="D">D</option>
        <option value="Eb">Eb</option>
        <option value="E">E</option>
        <option value="F">F</option>
        <option value="F#">F#</option>
        <option value="Gb">Gb</option>
        <option value="G">G</option>
      </select>
    </div>
    <div class="select">
      <label for="type-selector">Type </label>
      <select name="type-selector" id="type-selector" v-model="type">
        <option value="All">All Types</option>
        <option value="Major" selected>Major (Ionian)</option>
        <option value="Dorian">Dorian</option>
        <option value="Phrygian">Phrygian</option>
        <option value="Lydian">Lydian</option>
        <option value="Mixolydian">Mixolydian</option>
        <option value="Natural Minor">Natural Minor (Aeolian)</option>
        <option value="Locrian">Locrian</option>
        <option value="Harmonic Minor">Harmonic Minor</option>
        <option value="Melodic Minor">Melodic Minor</option>
      </select>
    </div>
    <div>
      <button @click="showScale">Display Scale</button>
    </div>
   
    
  </div>
</template>

<script>
export default {
  name: 'ScaleHome',
  props: {
    msg: String
  },

  data() {
    return {
      root: "",
      type: "",
      
    }
  },

  methods: {
    showScale() {
      this.$store.commit("SET_CURRENT_TYPE", this.type);
      this.$store.commit("SET_CURRENT_ROOT", this.root);
      
    }
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
