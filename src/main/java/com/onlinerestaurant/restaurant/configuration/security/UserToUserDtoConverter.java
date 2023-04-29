package com.onlinerestaurant.restaurant.configuration.security;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.onlinerestaurant.dto.UserDto;
import com.onlinerestaurant.restaurant.database.models.User;

@Component
public class UserToUserDtoConverter implements Converter<User, UserDto> {

    @Override
    @Nullable
    public UserDto convert(User user) {
        // TODO Auto-generated method stub
        final UserDto userDto = new UserDto(user.getId(),
                                            user.getEmail(),
                                            user.getVerifiedAt(),
                                            user.getRole().toString());
        return userDto;
    }

}
