package social_light;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.social.FacebookAutoConfiguration;
import org.springframework.boot.autoconfigure.social.TwitterAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.social.config.annotation.EnableSocial;



@EnableSocial
@EnableWebSecurity
//@EnableJpaRepositories
//@EnableJpaRepositories(basePackages = "social_light.repository.manager")
@SpringBootApplication




/*@EnableSocial
@EnableWebSecurity
@EnableJpaRepositories
@EnableNeo4jRepositories
@SpringBootApplication*/
public class ApplicationSocialLight extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationSocialLight.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationSocialLight.class, args); //NOSONAR
    }
}