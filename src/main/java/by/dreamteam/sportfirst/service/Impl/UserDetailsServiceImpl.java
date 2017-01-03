package by.dreamteam.sportfirst.service.Impl;

import by.dreamteam.sportfirst.entity.ClientsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import by.dreamteam.sportfirst.service.ClientService;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    ClientService clientService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        ClientsEntity client = clientService.getClientByName("asd");
        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority("ROLE_USER"));
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(client.getLogin(), client.getPassword(), roles);
        return userDetails;
    }
}
