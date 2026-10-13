package com.example.Task.tracking.system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TaskNotFaundException.class)
     public ResponseEntity<String>handletasknotfaund(TaskNotFaundException ex){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());

        }


        @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> hanlevalidation(MethodArgumentNotValidException ex){

         List <String> errors = ex.getBindingResult().getFieldErrors().stream().map(error->error.getDefaultMessage()).toList();


        return ResponseEntity.badRequest().body(errors);
        }
}
