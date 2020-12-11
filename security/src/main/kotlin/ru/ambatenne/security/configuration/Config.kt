package ru.ambatenne.security.configuration

import com.mchange.v2.c3p0.ComboPooledDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.view.InternalResourceViewResolver
import java.beans.PropertyVetoException
import javax.sql.DataSource

@Configuration
@ComponentScan(basePackages = ["ru.ambatenne.security", "ru.ambatenne.security.configuration"])
@EnableWebMvc
open class Config {

    @Bean
    open fun viewResolver(): ViewResolver {
        val internalResourceViewResolver: InternalResourceViewResolver = InternalResourceViewResolver()
        internalResourceViewResolver.setPrefix("/WEB-INF/view/")
        internalResourceViewResolver.setSuffix(".jsp")

        return internalResourceViewResolver
    }

    @Bean
    open fun dataSource(): DataSource {
        val dataSource: ComboPooledDataSource = ComboPooledDataSource()

        try{
            dataSource.driverClass = "com.mysql.cj.jdbc.Driver"
            dataSource.jdbcUrl = "jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=Europe/Moscow"
            dataSource.user = "bestuser"
            dataSource.password = "bestuser"

        }catch(e: PropertyVetoException) {
            e.printStackTrace()
        }

        return dataSource

    }
}