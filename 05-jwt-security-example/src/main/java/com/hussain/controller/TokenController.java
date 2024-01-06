package com.hussain.controller;

import com.hussain.config.security.JwtGenerator;
import com.hussain.model.JwtUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {


    private final JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    /**
     * {
     * "id":"10",
     * "role":"ROLE_ADMIN",
     * "userName":"shahzad"
     * }
     *
     * @param jwtUser
     * @return
     */
    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {
        return jwtGenerator.generate(jwtUser);
    }
}
