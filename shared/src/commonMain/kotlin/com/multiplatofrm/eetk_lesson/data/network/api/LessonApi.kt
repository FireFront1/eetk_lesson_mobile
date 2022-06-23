package com.multiplatofrm.eetk_lesson.data.network.api

import com.multiplatofrm.eetk_lesson.common.Resources
import com.multiplatofrm.eetk_lesson.common.iteration.apiBuilder
import com.multiplatofrm.eetk_lesson.domain.models.LessonModel
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlin.collections.get

class LessonApi(
    private val client: HttpClient
): ILessonApi {
    override suspend fun getWeekLesson(): Resources<LessonModel> {
        return try {
            val data = client.get {
                apiBuilder("api/get-scooter/")
            }
            return if (data.status == HttpStatusCode.OK)
            {
                Resources.Success(data = data.body())
            } else {
                Resources.Error(message = Errors.ERROR_SERVER)
            }
        } catch (e: Exception) {
            Resources.Error(message = Errors.ERROR_LOAD_DATA)
        }
    }

    object Errors {
        const val ERROR_LOAD_DATA = "Произошла ошибка при загрузке данных, проверьте интернет соединение"
        const val ERROR_SERVER = "Произошла ошибка при загрузке данных с сервера"
    }
}