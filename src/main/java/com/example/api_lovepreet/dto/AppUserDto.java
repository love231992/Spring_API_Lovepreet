package com.example.api_lovepreet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer appUserId;
    String appUserName;
    String appUserEmail;
    String appUserPhone;
}
