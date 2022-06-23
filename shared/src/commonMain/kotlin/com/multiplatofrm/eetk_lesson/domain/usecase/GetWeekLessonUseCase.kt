package com.multiplatofrm.eetk_lesson.domain.usecase

import com.multiplatofrm.eetk_lesson.common.Resources
import com.multiplatofrm.eetk_lesson.domain.models.LessonModel
import com.multiplatofrm.eetk_lesson.domain.repository.ScooterApiRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWeekLessonUseCase(
    private val cloudRepository: ScooterApiRepository
) {
    fun execute(): Flow<Resources<LessonModel>> = flow {
        emit(cloudRepository.getWeekLesson())
    }
}