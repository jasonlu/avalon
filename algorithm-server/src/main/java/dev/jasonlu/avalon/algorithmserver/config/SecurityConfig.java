package dev.jasonlu.avalon.algorithmserver.config;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * This config enables OAuth 2 using Spring Security 5.
 * Do to the time constraint I have no time to implement the actual OAuth on the front-end
 * (use accessToken to get user info)
 * But the OAuth flow is basically free effort using Spring Security 5.
 */
// @Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/api")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .oauth2Login();
//        http.csrf().disable();
//    }
//}