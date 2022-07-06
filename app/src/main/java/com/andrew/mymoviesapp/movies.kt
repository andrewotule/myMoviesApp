package com.andrew.mymoviesapp

class movies {
    var name: String? = null
    var des: String? = null // descrption
    var image: Int? = null

    constructor(name: String, des: String, image: Int) {
        this.name = name
        this.des = des
        this.image = image

    }
}