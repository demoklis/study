package com.demoklis.tech.jwt;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtToken {

	public static String SECRET = "FreeMaNong";
	
	public static String createToken() throws Exception{
		//签发时间
		Date iatDate = new Date();
		
		//过期时间- 1分钟过期
		Calendar nowTime = Calendar.getInstance();
		nowTime.add(Calendar.MINUTE, 1);
		Date expiresDate = nowTime.getTime();
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("alg", "HS256");
		map.put("typ", "JWT");
		String token = JWT.create()
				.withHeader(map)//header
				.withClaim("name", "Free码农")
				.withClaim("age", "28")
				.withClaim("org", "今日头条")
				.withExpiresAt(expiresDate)
				.withIssuedAt(iatDate)
				.sign(Algorithm.HMAC256(SECRET));
		return token;
	}
	
	public static Map<String,Claim> verifyToken(String token) throws Exception{
		JWTVerifier verifier=JWT.require(Algorithm.HMAC256(SECRET)).build();
		DecodedJWT jwt = null;
		try {
		jwt = verifier.verify(token);
		}catch(Exception e) {
			throw new RuntimeException("登陆凭证已过期");
		}
		return jwt.getClaims();
	}
}
