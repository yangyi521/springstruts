package com.trial.loginaction;

import com.opensymphony.xwork2.ActionSupport;
import com.trial.impl.Method;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private Method method;
	public void setMethod(Method method) {
		this.method = method;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		if(method.login(username, password)){
			return SUCCESS;
		}else{
			return INPUT;
		}
		
	}

}
