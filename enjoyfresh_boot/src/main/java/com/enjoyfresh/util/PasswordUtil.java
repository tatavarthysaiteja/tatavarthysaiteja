package com.enjoyfresh.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Component
public class PasswordUtil {

	public String newPassword() {
		StringBuffer buffer = null;
		SecureRandom random = new SecureRandom();
		int len = 4;
		String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		buffer = new StringBuffer("");
		for (int i = 0; i < len; i++) {
			int index = random.nextInt(charSet.length());
			buffer = buffer.append(charSet.charAt(index));
		}
		return buffer.toString();
	}

	public String getHash(String password, String mobile) {
		
		String hashtext = null;
		try {
			password = mobile.toUpperCase() + password;
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(("eCspE$d*" + password).getBytes("UTF8"));
			BigInteger number = new BigInteger(1, messageDigest);
			hashtext = number.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//logger.info("hashText:" + hashtext);
		return hashtext;
	}

	public String decode(String str) {
		String pwd = null;
		try {
			byte[] plain = Base64.decodeBase64(str.getBytes());
			pwd = new String(plain, "UTF8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return pwd;
	}

	public String encode(String plain) {
		String pwd = null;
		try {
			byte[] plainPswd = Base64.encodeBase64(plain.getBytes());
			pwd = new String(plainPswd, "UTF8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return pwd;
	}
}
