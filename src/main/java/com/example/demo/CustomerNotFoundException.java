package com.example.demo;

import org.springframework.web.bind.annotation.ResponseStatus;
import static org.springframework.http.HttpStatus.NOT_FOUND;
/**
 * @author XIAOBING
 */
@ResponseStatus(NOT_FOUND)

public class CustomerNotFoundException extends RuntimeException {

  	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException() {

       super("Could not find customer");

    }
}
