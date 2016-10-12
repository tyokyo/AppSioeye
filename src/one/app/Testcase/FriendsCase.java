package one.app.Testcase;

import one.app.Action.FriendsAction;
import one.app.Util.Base;

public class FriendsCase extends Base {
	public void testQddFollow() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			common.openActivity();
			common.navToFriends();
			
			for (int i = 1; i <=5; i++) {
				common.infoLog(" +Follows-"+i);
				String text = FriendsAction.addFirstSioeyeFollows();
				common.ScrollViewByText(text);
			}
			
			common.backToIdl();
			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
	public void testDelFollow() throws Exception{
		try {
			initUIAutomator(this.getName());
			common.startLog("*****Start to run " + runcase + " *****");
			
			common.openActivity();
			common.navToFriends();
			sleep(3000);
			for (int i = 0; i <=5; i++) {
				common.infoLog(" -Follows-"+i);
				String delfollowname = FriendsAction.delFirstSiosyeFollows();
				common.ScrollViewByTextNotFind(delfollowname);
			}
			
			common.backToIdl();
			common.passcase();
			common.startLog( "*****End to run " + runcase + " *****");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			common.handleException(e.getMessage());
		}
	}
}
