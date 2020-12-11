package ru.ambatenne.security.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import javax.sql.DataSource

@EnableWebSecurity
open class SecurityConfig: WebSecurityConfigurerAdapter() {

    @Autowired
    private lateinit var dataSource: DataSource

    override fun configure(auth: AuthenticationManagerBuilder?) {

        auth?.jdbcAuthentication()?.dataSource(dataSource)

    }

    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()?.
        antMatchers("/")?.hasAnyRole("EMPLOYEE", "MANAGER", "HR")?.
        antMatchers("/hr_info")?.hasRole("HR")?.
        antMatchers("/manager_info")?.hasRole("MANAGER")?.and()?.formLogin()?.permitAll()
    }
}