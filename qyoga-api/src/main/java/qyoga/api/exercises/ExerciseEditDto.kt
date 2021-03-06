package qyoga.api.exercises

import java.time.Duration

data class Tag(val tag: String) {

    override fun toString() = "#$tag"

}

data class ExerciseEditDto(
    val id: Long?,
    val name: String,
    val description: String,
    val instructions: String,
    val duration: Duration,
    val tags: List<Tag>,
    val images: List<Long>
) {

    fun imageUrls(baseUrl: String) = images.map { "$baseUrl/images/$it" }

}

