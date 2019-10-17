package com.example.listview_presiden

class ImageModel {
    var nama: String? = null
    var gambar: Int = 0

    fun getNamaa(): String {
        return nama.toString()
    }

    fun setNamaa(nama: String) {
        this.nama = nama
    }

    fun getGambarr(): Int {
        return gambar
    }

    fun setGambarr(gambar: Int) {
        this.gambar = gambar
    }

}
