package Domo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import Domo.domain.entity.MemberEntity;
import Domo.domain.entity.MemberEntityRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MyUserDetailsService implements UserDetailsService {

    //DB의 테이블에서 인증처리하기 위한 메서드

    @Autowired
    private MemberEntityRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info(">>>>>login page: email -> username ::::: "+username);
        MemberEntity entity =  (MemberEntity) repo.findByEmailAndSocialAndField(username,false,false);


        return new MyUserDetails(entity);

    }
}