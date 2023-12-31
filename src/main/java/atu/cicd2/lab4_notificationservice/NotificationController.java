package atu.cicd2.lab4_notificationservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @PostMapping("/notification")
    @ResponseStatus(HttpStatus.CREATED)
    public String notifyUser(@RequestBody UserDetails userDetails) {
        String notificationMessage = String.format("User %s (%s) has been successfully registered", userDetails.getName(), userDetails.getEmail());
        return notificationMessage;
    }
}
