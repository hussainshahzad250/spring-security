package com.hussain.config.security;

import com.hussain.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {

    private final String secretKey = "youtube";

    public JwtUser validate(String token) {
        try {
            Claims body = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
            JwtUser jwtUser = new JwtUser();
            jwtUser.setUserName(body.getSubject());
            jwtUser.setId(Long.parseLong((String) body.get("userId")));
            jwtUser.setRole((String) body.get("role"));
            return jwtUser;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
