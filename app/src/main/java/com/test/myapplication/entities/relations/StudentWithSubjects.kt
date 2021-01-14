package com.test.myapplication.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.test.myapplication.entities.Student
import com.test.myapplication.entities.Subject

data class StudentWithSubjects(
    @Embedded val student : Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )

    val subjects : List<Subject>
)