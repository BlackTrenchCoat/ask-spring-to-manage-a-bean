package org.theproject.askspringtomanageabean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.theproject.askspringtomanageabean.Book;

@Component
public class GetBookImpl implements GetBook {

    private ApplicationContext context;

    @Autowired
    public void context(ApplicationContext context) { this.context = context; }

	public Book getBook() {
        Book result = context.getBean("sia", Book.class);
        return result;
	}

}
