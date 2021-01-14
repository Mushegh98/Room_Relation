package com.test.myapplication.entities.relations

import androidx.room.Entity

//n To m
@Entity(tableName = "student_and_subject_table", primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(
    val studentName : String,
    val subjectName : String
)