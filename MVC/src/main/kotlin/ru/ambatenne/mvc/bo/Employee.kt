package ru.ambatenne.mvc.bo

import ru.ambatenne.mvc.validation.CheckEmail
import javax.validation.constraints.*

class Employee {

    @Size(min=2, message = "Name length must be at least 2 symbols")
    var name: String = ""
    @NotBlank(message = "Surname can not be blamk")
    var surname: String = ""
    @Min(value = 15000, message = "Salary can be less then 15000")
    @Max(value = 1500000, message = "Salary can be more then 1500000")
    var salary: Int = 0
    @CheckEmail
    var email: String = ""
    var department: String = ""
    var car: String = ""
    var langs: MutableList<String> = mutableListOf()

    val departments: Map<String, String> = mapOf("IT" to "Infomation Technology"
                                                ,"HR" to "Human Resources"
                                                ,"PR" to "Public relations")

    val carBrands: Map<String, String> = mapOf("BWM" to "BMW"
                                                ,"MB" to "Mercedes Benz"
                                                ,"Audi" to "Audi")

    val langList: List<String> = listOf("English", "Russian", "French", "Deutsch")

}