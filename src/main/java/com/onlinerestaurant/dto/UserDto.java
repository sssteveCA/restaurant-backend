package com.onlinerestaurant.dto;

import jakarta.validation.constraints.NotEmpty;


public record UserDto(Long id,
                      @NotEmpty(message = "L'indirizzo email è obbligatorio")
                      String email,
                      String verifiedAt,
                      @NotEmpty(message = "Il ruolo è obbligatorio")
                      String role) {} 



