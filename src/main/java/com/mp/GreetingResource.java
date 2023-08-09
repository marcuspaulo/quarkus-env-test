package com.mp;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    AwsConfigProperties awsConfigProperties;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AwsConfigProperties hello() {
        System.out.println("QueueName2: " +  awsConfigProperties.getQueueName());
        System.out.println("Region: " + awsConfigProperties.region);
        System.out.println("message: " + awsConfigProperties.message);
        return awsConfigProperties;
    }
}
