package dk.cachet.carp.protocals.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.requestMatchers().antMatchers("/login", "/oauth/authorize", "/exit").and().authorizeRequests().anyRequest()
				.authenticated().and()

				.formLogin().permitAll();
	}

}
