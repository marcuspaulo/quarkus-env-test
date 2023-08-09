package com.mp;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import java.util.Optional;

@ApplicationScoped
public class AwsConfigProperties {

//    @Inject
    @ConfigProperty(name = "aws.byob.pure.sqs.queue")
    private String queueName;

    @ConfigProperty(name = "aws.byob.region")
    public String region;

    @Inject
    @ConfigProperty(name = "greeting.message")
    String message;

    @ConfigProperty(name = "greeting.suffix", defaultValue="!")
    String suffix;

    @ConfigProperty(name = "greeting.name")
    Optional<String> name;

    public void testEnv() {
        System.out.println("Test Region: " + region);
    }

////    @ConfigProperty(name = "aws.byob.region")
////    //você declarou a variavel diferente
////    aws.region= xxxxxxx
//
//    public AwsConfigProperties() {
//    }
//
//    public AwsConfigProperties(String queueName, String region) {
//        this.queueName = queueName;
//        this.region = region;
//    }
//
//    public String getQueueName() {
//        return queueName;
//    }
//
//    public String getRegion() {
//        return region;
//    }


    public String getQueueName() {
        return queueName;
    }

    public String getRegion() {
        return region;
    }

    public String getMessage() {
        return message;
    }

    public String getSuffix() {
        return suffix;
    }

    public Optional<String> getName() {
        return name;
    }
}