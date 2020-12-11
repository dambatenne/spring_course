package ru.ambatenne.security.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class Controller {

    @GetMapping("/")
    fun getInfoForAllEmps(): String {
        return "view_for_all_emps"
    }

    @GetMapping("/hr_info")
    fun HRInfo(): String {
        return "view_only_for_hr"
    }

    @GetMapping("/manager_info")
    fun managersInfo(): String {
        return "view_only_for_managers"
    }
}