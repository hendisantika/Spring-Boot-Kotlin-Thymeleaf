package com.hendisantika.kotlin.thymeleaf.controller

import com.hendisantika.kotlin.thymeleaf.domain.Student
import com.hendisantika.kotlin.thymeleaf.form.CreateStudentForm
import com.hendisantika.kotlin.thymeleaf.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kotlin-thymeleaf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/04/18
 * Time: 06.05
 * To change this template use File | Settings | File Templates.
 */
@Controller
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @RequestMapping("/students")
    fun listStudents(model: Model): String {
        model.addAttribute("students", studentService.getStudents())
        return "students"
    }

    @RequestMapping("/student/{studentId}")
    fun findStudent(@PathVariable("studentId") sId: String, model: Model): String {
        model.addAttribute("student", studentService.findStudentById(sId))
        return "student"
    }

    @RequestMapping(value = "/student", method = arrayOf(RequestMethod.POST))
    fun addStudent(createStudentForm: CreateStudentForm, model: Model): String {

        studentService.createStudent(Student(
                studentId = createStudentForm.studentId!!,
                lastName = createStudentForm.lastName!!,
                firstName = createStudentForm.firstName!!))

        return "redirect:/student/" + createStudentForm.studentId
    }

    @RequestMapping(value = "/student")
    fun createStudentPage(model: Model): String {
        model.addAttribute("studentForm", CreateStudentForm())
        return "new-student-form"
    }
}