package com.test.myapplication

import androidx.room.*
import com.test.myapplication.entities.Director
import com.test.myapplication.entities.School
import com.test.myapplication.entities.Student
import com.test.myapplication.entities.Subject
import com.test.myapplication.entities.relations.*

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM school_table WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName : String) : List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school_table WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName : String) : List<SchoolWithStudents>

    @Transaction
    @Query("SELECT * FROM subject_table WHERE subjectName = :subjectName")
    suspend fun getStudentsOfSubject(subjectName: String) : List<SubjectWithStudents>

    @Transaction
    @Query("SELECT * FROM student_table WHERE studentName = :studentName")
    suspend fun getSubjectsOfStudent(studentName : String) : List<StudentWithSubjects>
}