package com.demoklis.tech.jwt;

import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.Claim;

public class JwtTokenDemo {

	public static void main(String[] args) throws Exception {
		String token=JwtToken.createToken();
		System.out.println("Token:"+ token);
		Map<String,Claim> claims=JwtToken.verifyToken(token);
		JWT jwt=JWT.decode(token);//这个是没验签的
		System.out.println(jwt.getClaim("name").asString());
		System.out.println(jwt.getClaim("age").asString());
		System.out.println(jwt.getClaim("org").asString());
		System.out.println(claims.get("name").asString());
		System.out.println(claims.get("age").asString());
		System.out.println(claims.get("org").asString());
		
		//使用过期token校验
		String expireToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJvcmciOiLku4rml6XlpLTmnaEiLCJuYW1lIjoiRnJlZeeggeWGnCIsImV4cCI6MTUxOTgxMjkxNCwiaWF0IjoxNTE5ODEyODU0LCJhZ2UiOiIyOCJ9.FXdQDv5bI06yBuigigB3CA09wYkV5e5PL4tt6DjTN8Y";

		Map<String,Claim> expireTokenClaims=JwtToken.verifyToken(expireToken);
	}
}
