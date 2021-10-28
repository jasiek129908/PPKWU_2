package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/string")
    public ResponseEntity<Response> getInformationAboutString(@RequestParam String text){
        Response response = new StringUtility("aaaBBB   123 ****").processTheString();
        return ResponseEntity.ok(response);
    }
}
