package com.backbay2.kolasecurity.security;

import com.backbay2.kolasecurity.modules.sys.model.SysResource;
import com.backbay2.kolasecurity.modules.sys.model.SysUser;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class SysUserPrincipal implements UserDetails {

    private final SysUser sysUser;
    private final List<SysResource> sysResourceList;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("User"));
    }

    //@Override
    //public Collection<? extends GrantedAuthority> getAuthorities() {
    //    return Collections.<GrantedAuthority>singletonList(new SimpleGrantedAuthority("User"));
    //}

    @Override
    public String getPassword() {
        return sysUser.getPassword();
    }

    @Override
    public String getUsername() {
        return sysUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return 0 == sysUser.getStatus();
    }


}
