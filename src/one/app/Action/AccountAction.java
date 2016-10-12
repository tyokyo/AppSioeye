package one.app.Action;

import one.app.Util.Base;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;


public class AccountAction extends Base {
	

	/**
	 *等待登陆操作完成
	 * @param time (time=10 （代表等待10*2 秒)
	 * @throws UiObjectNotFoundException 
	 */
	public static void waitForLoginSuccess(int time) throws UiObjectNotFoundException, Exception{
		int trytime=1;
		for (int i = 1; i <=time; i++) {
			if (common.findViewById2(one.app.Page.Account.lets_go).exists()||
					common.findViewById2(one.app.Page.Friends.search_friends).exists()) {
				common.infoLog(" Account Login Success ");
				break;
			}else {
				Thread.sleep(2000);
				common.infoLog("Wait "+i*2+"  second");
			}
			trytime = i;
		}
		if (trytime==time) {
			common.infoLog("Wait login failed for "+time*2 +"seconds");
		}
	}
	/**
	 * 输入用户名 密码 登陆账号
	 * @param username
	 * @param passwd
	 * @throws UiObjectNotFoundException 
	 */
	public static void loginSiosye(String username,String passwd) throws UiObjectNotFoundException, Exception{
		clickSignupLolginbtn();
		inputUserName(username);
		inputPassword(passwd);
		clickLoginbtn();
		waitForLoginSuccess(30);
		clickDonotShowAgain();
	}
	
	/**
	 * 登陆成功 取消提示
	 * @throws Exception 
	 */
	public static void clickDonotShowAgain() throws  Exception{
		UiObject donotshow = common.findViewById2(one.app.Page.Account.donot_show_again);
		donotshow.waitForExists(30000);
		if (donotshow.exists()) {
			common.infoLog("Login success");
			donotshow.clickAndWaitForNewWindow();
			clickLetsGobtn();
		}
	}
	/**
	 * 输入 密码
	 * @param passwd
	 * @throws Exception 
	 */
	public static void inputPassword(String passwd) throws  Exception{
		common.findViewById(one.app.Page.Account.password).setText(passwd);
	}
	/**
	 *输入 用户名
	 * @param username
	 * @throws Exception 
	 */
	public static void inputUserName(String username) throws  Exception{
		common.findViewById(one.app.Page.Account.username).setText(username);
	}
	
	/**
	 * Click 登陆按钮
	 * @throws Exception 
	 */
	public static void clickLoginbtn() throws  Exception{
		common.clickViewById(one.app.Page.Account.login);
	}
	/**
	 * Click 登陆/注册按钮
	 * @throws Exception 
	 */
	public static void clickSignupLolginbtn() throws  Exception{
		common.clickViewById(one.app.Page.Account.SignupLogin);
	}
	/**
	 * Click Let's go按钮
	 * @throws Exception 
	 */
	public static void clickLetsGobtn() throws  Exception{
		common.clickViewById(one.app.Page.Account.lets_go);
	}
}
