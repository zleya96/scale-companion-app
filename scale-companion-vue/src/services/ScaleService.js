import axios from "axios";

export default {
    getAllScales() {
        return axios.get('/scale');
    },

    getScaleByRootAndType(root, type) {
        return axios.get(`/scale/${root}/${type}`)
    },

    getScalesByRoot(root) {
        return axios.get(`/scale/${root}`);
    },

    getScalesByType(type) {
        return axios.get(`/scale/${type}`);
    }
}