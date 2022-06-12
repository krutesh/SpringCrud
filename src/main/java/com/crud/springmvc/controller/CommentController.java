package com.crud.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/comment")
public class CommentController {

    @GetMapping("/getComment")
    public ResponseEntity<String> getMessage(){
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Hello", HttpStatus.OK);
        return responseEntity;
    }
}
