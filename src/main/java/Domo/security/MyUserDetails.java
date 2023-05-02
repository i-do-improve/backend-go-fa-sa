package Domo.security;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import Domo.domain.entity.MemberEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyUserDetails extends User{

    private long id;
    private String email;
    private String name;
    private String nickName;
    private boolean social;
    private boolean field;

    private Map<String, Object> attributes;

    public MyUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public MyUserDetails(MemberEntity entity){
        this(entity.getEmail(), entity.getPass(),
                entity.getRoles()
                .stream()
                .map(roles -> new SimpleGrantedAuthority(roles.getRole()))// "ROLE_USER" or "ROLE_ADMIN"
                .collect(Collectors.toSet()));
        this.email=entity.getEmail();
        this.nickName = entity.getNickName();    //null일 수 있으므로
        this.social=entity.isSocial();
        this.field= entity.isField();
        this.id=entity.getId();
    }

    public Map<String, Object> getAttributes() {
        return this.attributes;
    }
}

