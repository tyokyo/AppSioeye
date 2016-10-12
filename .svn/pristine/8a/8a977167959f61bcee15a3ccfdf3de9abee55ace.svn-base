package one.test;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class test extends UiAutomatorTestCase{

	public void clickOnOff(String text) throws UiObjectNotFoundException{
			UiCollection videos = new UiCollection(
					new UiSelector().className("android.widget.ScrollView"));
			int count = videos.getChildCount(new UiSelector()
					.className("android.widget.RelativeLayout"));
			for (int instance = 0; instance < count; instance++) {
				UiObject uiObject = videos.getChildByInstance(
						new UiSelector().className("android.widget.RelativeLayout"),
						instance);
				UiObject sObject = uiObject.getChild(new UiSelector()
						.className("android.widget.TextView"));
				if (uiObject.exists() && uiObject.isEnabled() == true
						&& sObject.exists()) {
					if (sObject.getText().equals(text)) {
						UiObject switchbtn = uiObject.getChild(
								new UiSelector().className("android.widget.CompoundButton"));
					}
			}
		}
	}
	public void testA() throws Exception {
		UiScrollable uiScrollable = new UiScrollable(new UiSelector().scrollable(true));
		uiScrollable.scrollIntoView(new UiSelector().textMatches("^Live&Save"));
		//clickOnOff("Live&Save");
		
	}
}
