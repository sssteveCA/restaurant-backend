package com.onlinerestaurant.restaurant.configuration.security;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.onlinerestaurant.restaurant.interfaces.Constants;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("customAuthenticationEntryPoint")
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException, ServletException {
        // TODO Auto-generated method stub
        ObjectMapper om = new ObjectMapper();
        ObjectNode on = om.createObjectNode();
        on.put(Constants.KEY_DONE, false);
        on.put(Constants.KEY_MESSAGE, Constants.ERR_WRONG_CREDENTIALS);
        String formattedResponse = om.writerWithDefaultPrettyPrinter().writeValueAsString(on);
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getOutputStream().println(formattedResponse);
    }
    
}
