package com.banquier.springboot.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

import com.banquier.springboot.service.UserService;

public class AppAuthProvider  implements AuthenticationManager {

    @Autowired
    private UserService userService;

    @Override
    public Authentication authenticate(Authentication authentification) throws AuthenticationException{

        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentification;

        String username = auth.getName();
        String password = auth.getCredentials().toString();

        UserDetails user = userService.loadUserByUsername(username);

        if(user == null) {
            throw new BadCredentialsException("Log/pass unknowed");
        }
        return new UsernamePasswordAuthenticationToken(user, password, user.getAuthorities());
    }
}
