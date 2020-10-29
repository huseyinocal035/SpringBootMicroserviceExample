package huseyin.ocal.apigateway.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "web.security")
public class ApiGatewayProperties {

    private String status;

    private String registration;

    private String login;

    private String header;

    private String header_prefix;

    private String token_secret;

//    private String xxx;
//
//    @Data
//    public static class Xxx {
//
//        private String axxx;
//
//        private String bxxx;
//    }

}
