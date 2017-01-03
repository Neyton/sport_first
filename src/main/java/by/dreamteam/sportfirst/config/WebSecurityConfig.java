package by.dreamteam.sportfirst.config;

import org.apache.log4j.Logger;


//@Configuration
//@EnableWebMvcSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
//extends WebSecurityConfigurerAdapter
public class WebSecurityConfig {

    private static final Logger log = Logger.getLogger(WebSecurityConfig.class);

//    UserDetailsServiceImpl userDetailsService;

//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf()
//                .disable()
//                .authorizeRequests()
//                .antMatchers("/resources/**", "/**").permitAll()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .anyRequest().permitAll()
//                .and();
//
//        http.csrf()
//                .disable()
//                .exceptionHandling()
//                .authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/log1n"));
//
//        http
//                .formLogin()
//                .loginPage("/login")
//                .failureUrl("/login?error")
//                .loginProcessingUrl("/j_spring_security_check")
//                .defaultSuccessUrl("/user")
//                .usernameParameter("login")
//                .passwordParameter("password")
//                .permitAll()
//                .and()
//                .logout().permitAll()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/index")
//                .invalidateHttpSession(true);
//
//        http.rememberMe().and();
//
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(new UserDetailsServiceImpl());


//        auth
//            .inMemoryAuthentication()
//                .withUser("user").password("user").authorities("ROLE_USER")
//                .and()
//                .withUser("admin").password("admin").authorities("ROLE_ADMIN");
//    }

}
