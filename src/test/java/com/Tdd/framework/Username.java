package com.Tdd.framework;



public class Username {

	public boolean isvalidUsername(String username) {
		
		if(username.contains("/") || (username.contains("#")))
		{
			return false;
		}
		else if(username.contains("123")){
			return true;
		}
		else
		return true;
	}

}