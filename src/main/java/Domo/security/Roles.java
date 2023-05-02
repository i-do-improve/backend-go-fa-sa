package Domo.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
//Enum
@Getter
@RequiredArgsConstructor //파이널 필드를 파라미터로 구성하는 생성자
public enum Roles {

	USER("ROLE_USER"), //0
	ADMIN("ROLE_ADMIN"), //1
	BASIC("ROLE_BASIC"),
	PREMIUM("ROLE_PREMIUM");
	
	
	private final String role; //getRole() //ROLE_USER or ROLE_ADMIN
}
