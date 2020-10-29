package huseyin.ocal.usersmicroservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "web.security")
public class UsersMicroserviceProperties {

    private String expiration_time;

    private String token_secret;

    private String login;

}
