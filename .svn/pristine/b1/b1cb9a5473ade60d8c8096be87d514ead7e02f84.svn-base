package one.test;


import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.ckt.demo.UiAutomatorHelper;

public class ImageTestCase extends UiAutomatorTestCase {


	public void saveBitMapToSdcard(Bitmap bitmap,String newName){
		FileOutputStream out=null;
		try {
			String fileToWrite = "/mnt/sdcard/"+newName+".jpg";
			out=new FileOutputStream(fileToWrite);
			System.out.println(fileToWrite);
			if(out!=null){
				bitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);
				out.close();
			}
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 需求：截取一张图片后，另外为
	 * @param rect
	 * @param path
	 */
	public void cutBitmap(Rect rect,String path){
		Bitmap m=BitmapFactory.decodeFile(path);
		m=m.createBitmap(m, rect.left, rect.top, rect.width(), rect.height());
		saveBitMapToSdcard(m, "cutImg_888");
	}
	
	/**
	 * 需求：获取某个坐标点的颜色值
	 * @param x
	 * @param y
	 * @return
	 */
	public int getColorPicel(int x,int y){
		String path="/mnt/sdcard/testcolor.png";
		File file=new File(path);
		UiDevice.getInstance().takeScreenshot(file);
		Bitmap m=BitmapFactory.decodeFile(path);
		int color=m.getPixel(x, y);
		return color;
	}
	
	public void screenshotAndDrawText(String path,String imageName,String text){
		File file=new File(path);
		UiDevice.getInstance().takeScreenshot(file);
		Bitmap bitmap=BitmapFactory.decodeFile(path);
		Bitmap drawBitmap=drawTextBitmap(bitmap, text);
		saveBitMapToSdcard(drawBitmap, imageName);
	}
	public void screenshotAndDrawTextAndRect(String path,String imageName,String text,Rect rect){
		File file=new File(path);
		UiDevice.getInstance().takeScreenshot(file);
		Bitmap bitmap=BitmapFactory.decodeFile(path);
		Bitmap drawBitmap=drawTextRectBitmap(bitmap, text, rect);
		saveBitMapToSdcard(drawBitmap, imageName);
	}
	public Bitmap drawTextBitmap(Bitmap bitmap,String text){
		int x=bitmap.getWidth();
		int y=bitmap.getHeight();
		
		//创建一个比原来图片更大的位图
		Bitmap newBitmap=Bitmap.createBitmap(x, y+80, Bitmap.Config.ARGB_8888);
		Canvas canvans=new Canvas(newBitmap);
		Paint paint=new Paint();
		//在原图位置（0，0）叠加一张图片
		canvans.drawBitmap(bitmap, 0,0, paint);
		//画笔颜色
		paint.setColor(Color.parseColor("#FF0000"));
		paint.setTextSize(30);
		canvans.drawText(text, 20, y+55, paint);
		canvans.save(Canvas.ALL_SAVE_FLAG);
		canvans.restore();
		return newBitmap;
	}
	public Bitmap drawTextRectBitmap(Bitmap bitmap,String text,Rect rect){
		int x=bitmap.getWidth();
		int y=bitmap.getHeight();
		
		//创建一个比原来图片更大的位图
		Bitmap newBitmap=Bitmap.createBitmap(x, y+80, Bitmap.Config.ARGB_8888);
		Canvas canvans=new Canvas(newBitmap);
		Paint paint=new Paint();
		//在原图位置（0，0）叠加一张图片
		canvans.drawBitmap(bitmap, 0,0, paint);
		//画笔颜色
		paint.setColor(Color.parseColor("#FF0000"));
		paint.setTextSize(30);
		canvans.drawText(text, 20, y+55, paint);
		
		int x1 = rect.left;
		int y1 = rect.top;
		//for  phone device not iris4G
		double w = rect.right-rect.left;
		double h = rect.bottom-rect.top;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(h);
		System.out.println(w);
		canvans.drawLine((float)x1,(float) y1,(float) (x1+w),(float) y1, paint);
		canvans.drawLine((float)x1,(float) y1,(float) (x1),(float) (y1+h), paint);
		canvans.drawLine((float)(x1+w),(float) (y1+h),(float) (x1+w),(float) y1, paint);
		canvans.drawLine((float)(x1+w),(float) (y1+h),(float) (x1),(float) (y1+h), paint);
		canvans.save(Canvas.ALL_SAVE_FLAG);
		canvans.restore();
		return newBitmap;
	}
	
	public boolean imageSameAs(String targetImagePath,String comPath,double percent){
		try {
			Bitmap m1=BitmapFactory.decodeFile(targetImagePath);
			Bitmap m2=BitmapFactory.decodeFile(comPath);
			
			int width=m2.getWidth();
			int height=m2.getHeight();
			int numDiffPixels=0;
			for(int y=0;y<height;y++){
				for(int x=0;x<width;x++){
					if(m2.getPixel(x, y)!=m1.getPixel(x, y)){
						numDiffPixels++;
					}
				}
			}
			
			double totalPicels=height*width;
			double diffPercent=numDiffPixels/totalPicels;
			
			return percent<=1.0-diffPercent;
			
			
		} catch (Exception e) {
		}
		
		
		return false;
	}

	public void test(){
		screenshotAndDrawText("/mnt/sdcard/"+getTimeToString()+".jpg", "DrawText"+getTimeToString(), "Crash");
	}
	
	 private static String getTimeToString() {
	        SimpleDateFormat time = new SimpleDateFormat("yyyyMMddHHmmss");
	        Date date = new Date();
	        // 设置时间对象的格式
	        String timeToString = time.format(date);
	        return timeToString;
	    }
	public static void main(String args[]){
		new UiAutomatorHelper("AppSioeye", " one.test.ImageTestCase", "", "3");
	}

}
