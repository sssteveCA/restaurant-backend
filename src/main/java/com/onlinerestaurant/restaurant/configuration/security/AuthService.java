package com.onlinerestaurant.restaurant.configuration.security;


import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.onlinerestaurant.dto.UserDto;
import com.onlinerestaurant.restaurant.adapter.MyUserPrincipal;
import com.onlinerestaurant.restaurant.database.models.User;


@Service
public class AuthService {

    private final JwtProvider jwtProvider;

    private final UserToUserDtoConverter userToUserDtoConverter;

    public AuthService(JwtProvider jwtProvider, UserToUserDtoConverter userToUserDtoConverter) {
        this.jwtProvider = jwtProvider;
        this.userToUserDtoConverter = userToUserDtoConverter;
    }

    public Map<String, Object> createLoginInfo(Authentication authentication){
        MyUserPrincipal principal = (MyUserPrincipal)authentication.getPrincipal();
        User user = principal.getUser();
        UserDto userDto = this.userToUserDtoConverter.convert(user);
        //String token = this.jwtProvider.createToken(authentication);
        String token = "";
        Map<String, Object> loginMap = new HashMap<>();
        loginMap.put("user",userDto);
        loginMap.put("token",token);
        return loginMap;
    }


}
