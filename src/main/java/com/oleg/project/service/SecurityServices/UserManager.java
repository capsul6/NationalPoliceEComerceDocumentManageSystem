package com.oleg.project.service.SecurityServices;


import com.oleg.project.domain.User.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class UserManager {
    private HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<String, User>();
        users.put("user", new User("user", "userpassword", "ROLE_USER"));
        users.put("admin", new User("admin", "adminpassword", "ROLE_USER, ROLE_ADMIN"));
    }

    public User getUser(String username) throws UsernameNotFoundException {
        if( !users.containsKey( username ) ){
            throw new UsernameNotFoundException( username + " not found" );
        }

        return users.get( username );
    }
}
