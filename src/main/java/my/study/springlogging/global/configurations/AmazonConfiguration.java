package my.study.springlogging.global.configurations;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class AmazonConfiguration {
    private final Logger log = LoggerFactory.getLogger(AmazonConfiguration.class);

//    @Value("${AWS_ACCESS_KEY}")
    private String accessKey = "AWS_액세스키";
//    @Value("${AWS_SECRET_KEY}")
    private String secretKey = "AWS_시크릿키";

    private AWSCredentials awsCredentials;

    @PostConstruct
    public void init() {
        awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
    }

    @Bean
    public AWSCredentialsProvider awsCredentialsProvider() {
        return new AWSStaticCredentialsProvider(awsCredentials);
    }
}