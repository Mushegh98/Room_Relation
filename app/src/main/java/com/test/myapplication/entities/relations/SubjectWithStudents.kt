package com.test.myapplication.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.test.myapplication.entities.Student
import com.test.myapplication.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )

    val subjects : List<Student>
)