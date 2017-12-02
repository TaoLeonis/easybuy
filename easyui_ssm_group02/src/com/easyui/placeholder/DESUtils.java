package com.easyui.placeholder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class DESUtils {
	private static Key key;
	private static String KEY_STR="myKey";
	static{
		try {
			KeyGenerator generator = KeyGenerator.getInstance("DES");
			generator.init(new SecureRandom(KEY_STR.getBytes()));
			key = generator.generateKey();
			generator = null;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static String getEncryptString(String str){
		BASE64Encoder base64en = new BASE64Encoder();
		try {
			byte[] strBytes = str.getBytes("UTF-8");
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] encryptStrBytes = cipher.doFinal(strBytes);
			return base64en.encode(encryptStrBytes);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
	public static String getDecryptString(String str){
		BASE64Decoder base64De = new BASE64Decoder();
		try {
			byte[] strBytes = base64De.decodeBuffer(str);
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] decryptStrBytes = cipher.doFinal(strBytes);
			return new String(decryptStrBytes,"UTF-8");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		/*if(args ==null || args.length<1){
			System.out.println("请输入要加密的字符，用空格分隔");
		}else{
			for (String arg : args) {
				System.out.println(arg+":"+getEncryptString(arg));
			}
		}*/
		//System.out.println(getDecryptString("root"));
		System.out.println(getEncryptString("root"));
		System.out.println(getEncryptString("admin"));
	}
	
	
	
	
	
	
	
	
}
