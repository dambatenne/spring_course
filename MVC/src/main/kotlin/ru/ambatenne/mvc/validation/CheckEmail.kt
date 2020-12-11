package ru.ambatenne.mvc.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [CheckEmailValidator::class])
annotation class CheckEmail(val value: String = "abc.com",
                            val message: String = "Email must end with abc.com",
                            val groups: Array<KClass<*>> = [],
                            val payload: Array<KClass<out Payload>> = [])