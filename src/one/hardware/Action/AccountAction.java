package one.hardware.Action;

import one.hardware.Util.Base;

public class AccountAction extends Base {
	/**
	 * Click com.hicam:id/logout_btn按钮
	 */
	public static  void logout_btn() throws Exception {
		common.clickViewById(one.hardware.Page.Account.logout_btn);
	}
	/**
	 * 输入 com.hicam:id/login_id_input
	 */
	public static  void login_id_input(String username) throws Exception {
		common.findViewById(one.hardware.Page.Account.login_id_input).setText(username);
	}
	/**
	 * 输入 com.hicam:id/login_password_input
	 */
	public static  void login_password_input(String passwd) throws Exception {
		common.findViewById(one.hardware.Page.Account.login_password_input).setText(passwd);
	}
	/**
	 * Click com.hicam:id/logout_btn按钮
	 */
	public static  void login_btn_login() throws Exception {
		common.clickViewById(one.hardware.Page.Account.login_btn_login);
	}
	public static void loginAccount(String username,String passwd) throws Exception{
		login_id_input(username);
		login_password_input(passwd);
		login_btn_login();
	}
	public static boolean isLoginSuccess(){
		boolean isSuccess = false;
		for (int i = 0; i < 20; i++) {
			if (common.findViewByText2("^Account").exists()) {
				isSuccess= true;
				break;
			}else {
				common.infoLog("Login wait 1 seconds");
				common.waitTime(1);
			}
		}
		return isSuccess;
	}
}
