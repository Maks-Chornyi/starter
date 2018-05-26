package io.cursor.demobootstarter.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileResolverEnvironmentPostProcessor implements  EnvironmentPostProcessor{

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        for(int i = 0; i < 5; i++)
            System.out.println("Go hard... Or go home");

        if (environment.getActiveProfiles().length==0)
                environment.addActiveProfile("DEV");
    }
}
