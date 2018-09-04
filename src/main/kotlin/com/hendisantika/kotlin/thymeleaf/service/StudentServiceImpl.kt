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
            Student(studentId = "2", lastName = "Sasuke", firstName = "Uchiha"),
            Student(studentId = "3", lastName = "Sakura", firstName = "Haruno"),
            Student(studentId = "4", lastName = "Kakashi", firstName = "Hatake"),
            Student(studentId = "5", lastName = "Neji", firstName = "Hyuga"),
            Student(studentId = "6", lastName = "Ino", firstName = "Yamanaka"))

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