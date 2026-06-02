package com.hometracker.user_service.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String address;
    private boolean alerting;
    private double energyAlertingThreshold;

}
