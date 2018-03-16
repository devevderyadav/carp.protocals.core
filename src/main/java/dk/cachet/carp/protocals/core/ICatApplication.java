package dk.cachet.carp.protocals.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextListener;

@EnableDiscoveryClient
@Configuration
@EnableResourceServer
@ComponentScan(
        basePackages = "dk.cachet.carp.protocals.core")
       
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})

@EnableMongoRepositories(basePackageClasses =dk.cachet.carp.protocals.core.repository.DataPointRepository.class)
@SpringBootApplication
public class ICatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ICatApplication.class, args);
	}

	@Bean
	public RequestContextListener requestContextListener() {
	    return new RequestContextListener();
	}
}
