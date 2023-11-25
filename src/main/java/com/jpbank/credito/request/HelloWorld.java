package com.jpbank.credito.request;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    private String helloWorld = "Hello World!!";
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "hello-world", produces = "application/json")
    public ResponseEntity<?> getHello(){
        return new ResponseEntity<>(helloWorld, HttpStatus.OK);
    }

}
