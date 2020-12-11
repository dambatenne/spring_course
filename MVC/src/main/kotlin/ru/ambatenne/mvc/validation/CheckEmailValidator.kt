package ru.ambatenne.mvc.validation

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class CheckEmailValidator: ConstraintValidator<CheckEmail, String> {

    private var endOfEmail: String = ""

    override fun initialize(constraintAnnotation: CheckEmail?) {
        //super.initialize(constraintAnnotation)
        if (constraintAnnotation != null) {
            endOfEmail = constraintAnnotation.value
        }
    }

    override fun isValid(p0: String?, p1: ConstraintValidatorContext?): Boolean {
        if (p0 != null) {
            return p0.endsWith(endOfEmail)
        }
        return false
    }

}
