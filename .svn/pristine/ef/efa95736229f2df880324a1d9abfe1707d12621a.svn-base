package one.app.Action;

import java.util.ArrayList;

import one.app.Util.Base;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;

public class FriendsAction extends Base{
	/**
	 * 添加trending 列表好友-total（个数）
	 */
	public ArrayList<String> addtrending(String id) throws Exception {
		ArrayList<String> add_trending_list = new ArrayList<String>();
		common.clickViewById(one.app.Page.Friends.search_friends);
		UiCollection idCollection = new UiCollection(new UiSelector().resourceId(id));
		int count = idCollection.getChildCount();
		for(int i = 0 ; i <count;i++){
		}
		return add_trending_list;
	}

	/**
	 * Click 搜索好友按钮
	 */
	public static void clickSearchBtn() throws Exception {
		common.clickViewById(one.app.Page.Friends.search_friends);
	}

	/**
	 * Click Follwing按钮
	 */
	public static void clickFollowingBtn() throws Exception {
		common.clickViewById(one.app.Page.Friends.tab_following);
	}


	/**
	 * Click Followers按钮
	 */
	public static  void clickFollowersBtn() throws Exception {
		common.clickViewById(one.app.Page.Friends.tab_follower);
	}

	
	/**
	 * Click 第一个+Follow按钮
	 */
	public static UiObject findAddFollowBtn() throws Exception {
		return common.findViewById(one.app.Page.Friends.add_followbtn);
	}
	/**
	 * Click -Follow按钮
	 */
	public static UiObject findDelFollowBtn() throws Exception {
		return common.findViewById(one.app.Page.Friends.del_followbtn);
	}
	/**
	 *获取 第一个+Follow的text对象
	 */
	public static UiObject findAddFollowName() throws Exception {
		UiObject nameObject = common.findViewById(one.app.Page.Friends.add_followname);
		if (nameObject.exists()) {
			common.infoLog("GetText-Success:" + nameObject.getText());
		}else {
			common.infoLog("GetText-Failed:" + nameObject.getText());
		}
		return nameObject;
	}
	public static void waitListRefresh() throws Exception {
		
	}
	/**
	 * 输入搜索账号
	 */
	public static UiObject findSearchSiosye() throws Exception {
		return common.findViewById(one.app.Page.Friends.edit_search_key);
	}
	public static String addFirstSioeyeFollows() throws Exception{
		clickFollowingBtn();
		clickSearchBtn();
		Thread.sleep(3000);
		UiObject addFollowbtnObject = findAddFollowBtn();
		UiObject addFollownameObject = FriendsAction.findAddFollowName();
		String text = addFollownameObject.getText();
		addFollowbtnObject.clickAndWaitForNewWindow();
		common.infoLog("+Follow:" + text);
		common.navigateup();
		return text;
	}
	/**
	 * 取消第一个Follow
	 */
	public static String delFirstSiosyeFollows() throws Exception {
		clickFollowingBtn();
		UiSelector fnameselector =new UiSelector().resourceId(one.app.Page.Friends.add_followname).instance(1);
		UiObject fname = new UiObject(fnameselector);
		String text = fname.getText();
		fname.clickAndWaitForNewWindow();
		findDelFollowBtn().click();
		common.infoLog(" -Follows:" + text);
		return text;
	}
}
