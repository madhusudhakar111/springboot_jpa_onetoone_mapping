package org.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.student.dto.UserRequest;
import org.student.entity.User;
import org.student.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuseraddress")
    public ResponseEntity<String> save(@RequestBody UserRequest user){
        try {
            userService.save(user);
            return ResponseEntity.ok("Success");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failure" + e.getMessage());
        }
    }

    @GetMapping("/getuseradress")
    public ResponseEntity<?> save(@RequestParam Long userId) {
        try {
            User user = userService.findUserById(userId);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failure" + e.getMessage());
        }
    }


}
