package ru.ambatenne.mvc.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import ru.ambatenne.mvc.bo.Employee
import javax.validation.Valid

@Controller
class Controller {

    @RequestMapping("/")
    fun showHomeView(): String {
        return "homeView"
    }

    @RequestMapping("/askDetails")
    fun showAskDetails(model: Model): String {

        model.addAttribute("employee", Employee())

        return "askDetailsView"
    }

    @RequestMapping("/showDetails")
    fun showDetails(@Valid @ModelAttribute("employee") emp: Employee, bindingResult: BindingResult): String {

        if(bindingResult.hasErrors()) {
            return "askDetailsView"
        }else {
            return "showDetailsView"
        }
    }
}
