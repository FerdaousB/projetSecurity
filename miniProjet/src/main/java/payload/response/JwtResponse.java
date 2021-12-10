package payload.response;

import java.util.List;

public class JwtResponse {

	private String token;
	private String type = "Bearer";
	private Long userId;
	private String firstname;
	private String name;
	private String mail;
	private List<String> listrole;

	public JwtResponse(String accessToken, Long userId, String firstname, String name, String mail,
			List<String> listrole) {
		super();
		this.token = accessToken;
		this.userId = userId;
		this.firstname = firstname;
		this.name = name;
		this.mail = mail;
		this.listrole = listrole;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
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

	public List<String> getListrole() {
		return listrole;
	}

	public void setListrole(List<String> listrole) {
		this.listrole = listrole;
	}

}
