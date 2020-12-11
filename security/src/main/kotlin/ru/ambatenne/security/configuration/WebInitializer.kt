package ru.ambatenne.security.configuration

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class WebInitializer: AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return null
    }

    override fun getServletConfigClasses(): Array<Class<*>>? {
        return arrayOf(Config::class.java)
    }
}