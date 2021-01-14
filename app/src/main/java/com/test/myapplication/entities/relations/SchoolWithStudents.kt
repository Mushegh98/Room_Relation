package com.test.myapplication.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.test.myapplication.entities.School
import com.test.myapplication.entities.Student

//1 to N
data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )

    val student: List<Student>
)
