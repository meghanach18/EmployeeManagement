package com.example.employeemannagement.security;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }
    @Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
		csrf().disable()
	    .authorizeRequests()
		.antMatchers("/login")
		.permitAll()
		.antMatchers("/list","/addEmployee","/js/form.js")
		.hasAnyRole("ADMIN","USER")
		.antMatchers("/create")
		.hasAnyRole("ADMIN")
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/list")
		.failureUrl("/login?error=true")
		.permitAll()
		.and()
		.logout()
		.logoutSuccessUrl("/login?logout=true")
		.invalidateHttpSession(true)
		.permitAll()
		.and()
		.headers().frameOptions().disable();
		

	}
   
   
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}