package com.pizzamanagement.pizzatype.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

public class PizzaTypeException {
    public ResponseEntity<?>resourceNotFoundException(ResourceNotFound ex, WebRequest request){
        ErrorDetails errorDetails=new ErrorDetails(ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
