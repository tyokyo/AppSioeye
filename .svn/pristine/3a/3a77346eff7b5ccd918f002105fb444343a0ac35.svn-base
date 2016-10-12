package one.app.Testcase;

import one.app.Action.AccountAction;
import one.app.Util.Base;

public class AccountCase  extends Base {
	public void testLogin() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			common.clearAppData();
			common.openActivity();
			//common.configTimeout(5000);
			AccountAction.loginSiosye("tyokyo@126.com", "123456789");
			
			common.backToIdl();
			common.passcase();
			
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
}
