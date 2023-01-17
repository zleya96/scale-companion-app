import ScaleService from '@/services/ScaleService'
import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    allScales: []
  },
  getters: {
  },
  mutations: {
    SET_ALL_SCALES(state) {
      ScaleService.getAllScales().then(response => {
        state.allScales = response.data;
      })
    }
  },
  actions: {
  },
  modules: {
  }
})
