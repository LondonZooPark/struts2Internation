package action;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.websocket.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String account;
	private String password;
	//Map session = ActionContext.getContext().getSession();
	//Locale locale = (Locale)session.get("WW_TRANS_I18N_LOCALE");
	//ResourceBundle resourceBundle = ResourceBundle.getBundle("international", locale);
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override 
	public String execute() {
			
		return "success";
	}
	public void validate() {
		super.validate();
		Map session = ActionContext.getContext().getSession();
		Locale locale = (Locale)session.get("WW_TRANS_I18N_LOCALE"); 
		 if(locale==null){  
	            locale = new Locale("zh","CN");  
	            session.put("WW_TRANS_I18N_LOCALE",locale);  
	        }  
		ResourceBundle resourceBundle = ResourceBundle.getBundle("international", locale);
		if("".equals(account)) {
			this.addFieldError("account", resourceBundle.getString("AccountEmpty"));
		}
		else {
			if("admin".equals(this.account)==false)
			{
				this.addFieldError("account", resourceBundle.getString("AccountError"));
				//return "error";
			}
		}
		if("".equals(password)) {
			this.addFieldError("password", resourceBundle.getString("PasswordEmpty"));
			
		}else {
			if("12345".equals(this.password)==false) {
				this.addFieldError("password", resourceBundle.getString("PasswordError"));
			}
		}
	}
}
