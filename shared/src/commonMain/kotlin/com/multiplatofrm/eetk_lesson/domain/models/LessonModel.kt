package com.multiplatofrm.eetk_lesson.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class LessonModel(val teacher_info: String, val lesson_number: Int, val cab: String,
val group: String, val name_lesson: String, val date: String)
