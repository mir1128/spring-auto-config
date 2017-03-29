package com.loobo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
    @Bean
    @Conditional(FooCondition.class)
    public UserInterface fooDataSource() {
        return null;
    }

    @Bean
    @Conditional(BarCondition.class)
    public UserInterface barDataSource() {
        return null;
    }
}
