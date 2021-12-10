package payload.request;

import org.hibernate.validator.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
	private String name;

	@NotBlank
	private String userPassword;

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

}
