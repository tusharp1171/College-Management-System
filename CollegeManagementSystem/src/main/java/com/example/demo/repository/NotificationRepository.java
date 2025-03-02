package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Notification;
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}