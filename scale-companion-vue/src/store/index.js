import ScaleService from '@/services/ScaleService'
import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    allScales: [],
    currentRoot: "",
    currentType: "",
    currentScale: {},
  },
  getters: {
  },
  mutations: {
    SET_ALL_SCALES(state) {
      ScaleService.getAllScales().then(response => {
        state.allScales = response.data;
        
      })
    },
    SET_CURRENT_SCALE(state) {
      ScaleService.getScaleByRootAndType(this.state.currentRoot, this.state.currentType).then(response => {
        state.currentScale = response.data;
      })
    },
    SET_CURRENT_ROOT(state, root) {
      state.currentRoot = root;
    },
    SET_CURRENT_Type(state, type) {
      state.currentType = type;
    },
  },
  actions: {
  },
  modules: {
  }
})
