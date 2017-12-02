package com.easyui.placeholder;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer{
	private String[] encryptPropNames={"username","password"};
	
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if(isEncryptProp(propertyName)){
			String decryptValue = DESUtils.getDecryptString(propertyValue);
			System.out.println(decryptValue);
			return decryptValue;
		}else{
			return propertyValue;
		}
	}

	private boolean isEncryptProp(String propertyName) {
		for (String encryptPropName : encryptPropNames) {
			if(encryptPropName.equals(propertyName)){
				return true;
			}
		}
		return false;
	}
	
}
