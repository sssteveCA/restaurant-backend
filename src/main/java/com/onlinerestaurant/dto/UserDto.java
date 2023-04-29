package com.onlinerestaurant.dto;

import jakarta.validation.constraints.NotEmpty;

public record UserDto(Integer id,
                      @NotEmpty(email = "L'indirizzo email è obbligatorio")
                      String email,
                      String verifiedAt,
                      @NotEmpty(message = "Il ruolo è obbligatorio")
                      String role) {
}
