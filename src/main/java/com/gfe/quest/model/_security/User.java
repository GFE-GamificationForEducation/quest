package com.gfe.quest.model._security;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Clase de modelo que representa al Usuario con los permisos y credenciales para
 * la aplicacion. 
 * @author BICUGUAL
 */
public class User implements UserDetails{

	private static final long serialVersionUID = 1L;

	private int idUser;
	private String username;
	private String password;
	private String ip;
	private Timestamp logintime;
	private Timestamp logouttime;


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", password=" + password + ", ip=" + ip
				+ ", logintime=" + logintime + ", logouttime=" + logouttime + ", authorities=" + authorities
				+ ", accountNonExpired=" + accountNonExpired + ", accountNonLocked=" + accountNonLocked
				+ ", credentialsNonExpired=" + credentialsNonExpired + ", enabled=" + enabled + "]";
	}

	/* Spring Security fields*/
    private List<Privilege> authorities;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true; 
	
    public User() {
	    super();
	}
    
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	@Override
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password){
			this.password = password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }
     
    public void setAuthorities(List<Privilege> authorities) {
        this.authorities = authorities;
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }
     
    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }
     
    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }
     
    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }
 
    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
 
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getLogintime() {
		return logintime;
	}

	public void setLogintime(Timestamp logintime) {
		this.logintime = logintime;
	}

	public Timestamp getLogouttime() {
		return logouttime;
	}

	public void setLogouttime(Timestamp logouttime) {
		this.logouttime = logouttime;
	}
}