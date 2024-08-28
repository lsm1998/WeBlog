import axios from "@/axios"

export function savePageHeader(data) {
    return axios.post("/admin/pageHeader/save", data)
}

export function getPageHeaderList(data) {
    return axios.post("/admin/pageHeader/list", data)
}

export function deletePageHeader(id) {
    return axios.post("/admin/pageHeader/delete", {id})
}