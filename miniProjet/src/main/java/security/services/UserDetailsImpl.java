package security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thp.spring.simplecontext.entity.User;

public class UserDetailsImpl  {

	private static final long serialVersionUID = 1L;

	private Long userId;

	private String firstname;

	private String name;

	private String mail;

	@JsonIgnore

	private String userPassword;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(Long userId, String firstname, String name, String mail, String userPassword,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.name = name;
		this.mail = mail;
		this.userPassword = userPassword;
		this.authorities = authorities;
	}

	public static  UserDetailsImpl build(User user) {
		List<GrantedAuthority> authorities = user.getListRole().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());

		return new UserDetailsImpl(user.getUserId(), user.getFirstname(), user.getName(), user.getMail(),
				user.getUserPassword(), authorities);
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(userId, user.userId);
	}

}
