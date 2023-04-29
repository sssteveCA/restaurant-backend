package com.onlinerestaurant.restaurant.configuration.security;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.onlinerestaurant.restaurant.database.models.User;

@Component
public class UserToUserDtoConverter implements Converter<User, UserDto> {

    @Override
    public UserDto convert(User source) {
        // We are not setting password in DTO.
        final UserDto userDto = new UserDto(source.getId(),
                                            source.getEmail(),
                                            source.getVerifiedAt(),
                                            source.getRole());
        return userDto;
    }

}
