package com.hendisantika.kotlin.thymeleaf.service

import com.hendisantika.kotlin.thymeleaf.domain.Student
import org.springframework.stereotype.Service

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kotlin-thymeleaf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/04/18
 * Time: 06.03
 * To change this template use File | Settings | File Templates.
 */
@Service
class StudentServiceImpl : StudentService {

    // This represents your database or any data source
    val studentList: MutableList<Student> = mutableListOf(
            Student(studentId = "1", lastName = "Naruto", firstName = "Uzumaki"),
            Student(studentId = "2", lastName = "Sasuke", firstName = "Uchiha"))

    override fun getStudents(): List<Student> {
        return studentList
    }

    override fun findStudentById(id: String): Student? {
        return studentList.find { s -> s.studentId.equals(id) }
    }

    override fun createStudent(student: Student) {
        studentList.add(student)
    }
}