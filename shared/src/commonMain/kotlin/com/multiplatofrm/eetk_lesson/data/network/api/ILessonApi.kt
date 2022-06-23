package com.multiplatofrm.eetk_lesson.data.network.api

import com.multiplatofrm.eetk_lesson.common.Resources
import com.multiplatofrm.eetk_lesson.domain.models.LessonModel

interface ILessonApi {
    suspend fun getWeekLesson(): Resources<LessonModel>
}