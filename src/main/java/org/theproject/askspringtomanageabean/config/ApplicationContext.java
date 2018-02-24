package org.theproject.askspringtomanageabean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.theproject.askspringtomanageabean.service.GetBook;
import org.theproject.askspringtomanageabean.service.GetBookImpl;

@Configuration
public class ApplicationContext {

    @Bean
    public GetBook getInstance() {
        return new GetBookImpl();
    }
}
