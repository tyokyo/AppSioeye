package one.hardware.Testcase;

import one.hardware.Action.AccountAction;
import one.hardware.Action.CameraAction;
import one.hardware.Util.Base;

public class AccountCase extends Base{
	public void testLogin() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			common.initDevice();
			common.pmclear();
			common.startCamera();
			CameraAction.navconfig(one.hardware.Page.Camera.nav_menu[0]);
			CameraAction.cameraSetting();
			common.ScrollViewByText("Live&Save");
			CameraAction.openCompoundButton("Live&Save");
			common.ScrollViewByText("Account");
			common.clickViewByText("Account");
			AccountAction.loginAccount("tyokyo@126.com", "123456789");
			boolean login = one.hardware.Action.AccountAction.isLoginSuccess();
			if (login) {
				common.infoLog(" 账号登陆成功");
				common.passcase();
			}else {
				common.infoLog(" 账号登陆失败");
				common.failcase(runcase);
			}
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
}
