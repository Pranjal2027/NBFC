package com.xuriti.api_admin_login;


public class TokenProvider {
	private static TokenProvider INSTANCE = new TokenProvider();
	
    private String token = null;
    
    TokenProvider() {  
    	
    
    }
    
    public static TokenProvider getInstance() {
        return INSTANCE;
    }
    
    public boolean hasToken() {
    	return this.token != null;
    }
    
    public String getToken() {
    	return token;
    }
    
    public void setToken(String token) {
    	this.token = token;
    }

    
}
