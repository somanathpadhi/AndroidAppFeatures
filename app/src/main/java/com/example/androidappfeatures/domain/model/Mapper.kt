package com.example.androidappfeatures.domain.model

import com.example.androidappfeatures.data.model.PostDTO


fun PostDTO.toDomain(): Post {
    return Post(title = this.title)
}

