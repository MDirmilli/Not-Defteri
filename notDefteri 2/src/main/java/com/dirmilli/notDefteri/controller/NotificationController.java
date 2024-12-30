package com.dirmilli.notDefteri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dirmilli.notDefteri.dto.NotificationDto;
import com.dirmilli.notDefteri.entities.Notification;
import com.dirmilli.notDefteri.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/note-created")
    public NotificationDto sendNotification() {
        NotificationDto notificationDto = new NotificationDto();
        Notification notification = new Notification();
        notificationService.sendNotification(notification);

        notificationDto.setMessage(notification.getMessage());
        return notificationDto;
    }

}



