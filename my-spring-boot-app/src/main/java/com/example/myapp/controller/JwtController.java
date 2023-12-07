package com.example.myapp.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;
import java.util.Date;

@RestController
public class JwtController {

    private static final Key SECRET_KEY = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);

    @PostMapping("/validate")
    public String validateJwtToken(@RequestBody String jwtToken) {
        // TODO: Implement JWT token validation logic here
        // You can use libraries like jjwt or Nimbus JOSE + JWT for token validation

        // BEGIN: Validation Logic
        if (isValidToken(jwtToken)) {
            return "Valid JWT token";
        } else {
            return "Invalid JWT token";
        }
        // END: Validation Logic
    }

    private boolean isValidToken(String jwtToken) {
        // TODO: Implement JWT token validation logic here
        // You can use libraries like jjwt or Nimbus JOSE + JWT for token validation

        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(jwtToken)
                    .getBody();

            Date expirationDate = claims.getExpiration();
            Date currentDate = new Date();

            return !currentDate.after(expirationDate);
        } catch (Exception e) {
            return false;
        }
    }
}
