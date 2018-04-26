package com.hendisantika.kotlin.thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kotlin-thymeleaf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/04/18
 * Time: 06.04
 * To change this template use File | Settings | File Templates.
 */
@Controller
class IndexController {

    @RequestMapping("/")
    fun index(): String {
        return "index"
    }
}