package com.url.shortner.Service;

import com.url.shortner.Model.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Data
@NoArgsConstructor
public class UserDetailsImpl implements UserDetails {

    private Long id;
    private String username;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(Collection<? extends GrantedAuthority> authorities,
                           String password,
                           String email,
                           String username,
                           Long id) {
        this.authorities = authorities;
        this.password = password;
        this.email = email;
        this.username = username;
        this.id = id;
    }

    public static UserDetailsImpl build(User user) {
        GrantedAuthority authority =
                new SimpleGrantedAuthority(user.getRole()); // MUST be ROLE_USER

        return new UserDetailsImpl(
                Collections.singletonList(authority),
                user.getPassword(),
                user.getEmail(),
                user.getUsername(),
                user.getId()
        );
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}