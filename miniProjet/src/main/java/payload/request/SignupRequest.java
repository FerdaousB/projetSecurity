package payload.request;

import java.util.Set;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class SignupRequest {

	@NotBlank
	private String firstname;

	@NotBlank
	private String name;

	@NotBlank
	private String userPassword;

	@NotBlank
	@Email
	private String mail;

	private Set<String> listrole;

	@NotBlank
	private String password;

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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Set<String> getListrole() {
		return listrole;
	}

	public void setListrole(Set<String> listrole) {
		this.listrole = listrole;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
