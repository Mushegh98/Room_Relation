package com.test.myapplication.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.test.myapplication.entities.Director
import com.test.myapplication.entities.School

//1 To 1
data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)