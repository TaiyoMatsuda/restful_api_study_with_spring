package com.appsdeveloperblog.app.ws.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	private final Random RANDOM = new SecureRandom();
	private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	/***
	 * userIDをStringで返します。
	 * @param length userIDの文字数 
	 * @return generateRandomStringで作成したuserIDの値を返します。
	 */
	public String generateUserId(int length) {
		return generateRandomString(length);
	}
	
	/***
	 * userIdを作成します。
	 * @param length userIDの文字数 
	 * @return length桁のuserIdをランダムで作成し、その値を返します。
	 */
	private String generateRandomString(int length) {
		
		StringBuilder returnValue = new StringBuilder(length);
		
		for(int i = 0; i < length; i++) {
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		return new String(returnValue);
	}
}
