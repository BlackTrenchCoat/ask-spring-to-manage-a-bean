package org.theproject.askspringtomanageabean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.theproject.askspringtomanageabean.service.GetBookImpl;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    AbstractApplicationContext applicationContext;

    @Autowired
    GetBookImpl gb;

    @Override
    public void run(String... args) throws Exception {
        Book springInAction = new Book("Craig Walls", "Spring in Action");

        ConfigurableListableBeanFactory bf = applicationContext.getBeanFactory();

        bf.registerSingleton("sia", springInAction);

        Book b = gb.getBook();
        System.out.println("Book: " + b);
    }
}