package com.dirmilli.notDefteri.service;

import org.springframework.stereotype.Service;

import com.dirmilli.notDefteri.entities.Notification;

@Service
public class NotificationService {


    public void sendNotification(Notification notification) {
        // Simulate sending a notification (e.g., push notification, email, etc.)
        System.out.println("Notification Sent:");
        System.out.println("Message: " + notification.getMessage());

    }


}
