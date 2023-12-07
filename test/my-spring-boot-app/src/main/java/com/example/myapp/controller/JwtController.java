package com.example.myapp.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class JwtController {

    /**
     * Validates a JWT token.
     * 
     * @param token the JWT token to validate
     * @return true if the token is valid, false otherwise
     */
    public boolean validateJwtToken(String token) {
        try {
            Claims claims = Jwts.parser().setSigningKey("yourSecretKey").parseClaimsJws(token).getBody();

            // Check token expiry
            Date expirationDate = claims.getExpiration();
            Date currentDate = new Date();
            if (expirationDate.before(currentDate)) {
                return false; // Token has expired
            }

            return true; // Token is valid
        } catch (Exception e) {
            return false; // Token validation failed
        }
    }

    /**
     * Generates a JWT token.
     * 
     * @param subject        the subject of the token
     * @param expirationTime the expiration time of the token in milliseconds
     * @param secretKey      the secret key used to sign the token
     * @return the generated JWT token
     */
    public String generateJwtToken(String subject, long expirationTime, String secretKey) {
        Date currentDate = new Date();
        Date expirationDate = new Date(currentDate.getTime() + expirationTime);

        String token = Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(currentDate)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();

        return token;
    }
}