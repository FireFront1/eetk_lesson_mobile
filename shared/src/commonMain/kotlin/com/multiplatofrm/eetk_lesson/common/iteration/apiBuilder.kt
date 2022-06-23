package com.multiplatofrm.eetk_lesson.common.iteration

import com.multiplatofrm.eetk_lesson.common.ServerSettings
import io.ktor.client.request.*
import io.ktor.http.*

fun HttpRequestBuilder.apiBuilder(path: String) {
    url {
        takeFrom(ServerSettings.URL_API_IOS)
        encodedPath = path
    }
}