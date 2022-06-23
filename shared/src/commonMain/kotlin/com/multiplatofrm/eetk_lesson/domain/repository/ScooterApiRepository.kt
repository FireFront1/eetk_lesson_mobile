package com.multiplatofrm.eetk_lesson.domain.repository

import com.multiplatofrm.eetk_lesson.common.Resources
import com.multiplatofrm.eetk_lesson.domain.models.LessonModel
import kotlinx.coroutines.flow.Flow

interface ScooterApiRepository {
    suspend fun getWeekLesson(): Resources<LessonModel>
}