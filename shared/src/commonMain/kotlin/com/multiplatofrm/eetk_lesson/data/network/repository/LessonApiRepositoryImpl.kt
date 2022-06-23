package com.multiplatofrm.eetk_lesson.data.network.repository

import com.multiplatofrm.eetk_lesson.common.Resources
import com.multiplatofrm.eetk_lesson.data.network.api.ILessonApi
import com.multiplatofrm.eetk_lesson.domain.models.LessonModel
import com.multiplatofrm.eetk_lesson.domain.repository.ScooterApiRepository

class LessonApiRepositoryImpl(
    private val cloudNetwork: ILessonApi
): ScooterApiRepository {
    override suspend fun getWeekLesson(): Resources<LessonModel> {
        return cloudNetwork.getWeekLesson()
    }
}