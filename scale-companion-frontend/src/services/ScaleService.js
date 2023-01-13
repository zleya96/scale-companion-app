import axios from "axios";

export default {
    getAllScales() {
        return axios.get('/scale');
    },

    getScalesByRootAndType(root, type) {
        return axios.get(`/scale/${root}_${type}`)
    },

    getScalesByRoot(root) {
        return axios.get(`/scale/${root}`);
    },

    getScalesByType(type) {
        return axios.get(`/scale/${type}`);
    }
}