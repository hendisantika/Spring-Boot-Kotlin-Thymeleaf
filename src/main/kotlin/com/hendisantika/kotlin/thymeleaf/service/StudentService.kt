package com.hendisantika.kotlin.thymeleaf.service

import com.hendisantika.kotlin.thymeleaf.domain.Student

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kotlin-thymeleaf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/04/18
 * Time: 07.48
 * To change this template use File | Settings | File Templates.
 */
interface StudentService {
    fun getStudents(): List<Student>

    fun findStudentById(id: String): Student?

    fun createStudent(student: Student)
}