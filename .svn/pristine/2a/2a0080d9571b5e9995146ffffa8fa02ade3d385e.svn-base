package one.test;

import java.io.File;
import java.io.FileOutputStream;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Environment;

public class bitmap {
	/**
     * 获取和保存当前屏幕的截图
     */
    private void GetandSaveCurrentImage()  
    {  
        //1.构建Bitmap  
    	int w=0 ; 
    	int h=0;
        Bitmap Bmp = Bitmap.createBitmap( w, h, Config.ARGB_8888 );      

        String SavePath = getSDCardPath()+"/AndyDemo/ScreenImage";

        //3.保存Bitmap   
        try {  
            File path = new File(SavePath);  
            //文件  
            String filepath = SavePath + "/Screen_1.png";  
            File file = new File(filepath);  
            if(!path.exists()){  
                path.mkdirs();  
            }  
            if (!file.exists()) {  
                file.createNewFile();  
            }  

            FileOutputStream fos = null;  
            fos = new FileOutputStream(file);  
            if (null != fos) {  
                Bmp.compress(Bitmap.CompressFormat.PNG, 90, fos);  
                fos.flush();  
                fos.close();    

                //Toast.makeText(mContext, "截屏文件已保存至SDCard/AndyDemo/ScreenImage/下", Toast.LENGTH_LONG).show();  
            }  

        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  

    /**
     * 获取SDCard的目录路径功能
     * @return
     */
    private String getSDCardPath(){
        File sdcardDir = null;
        //判断SDCard是否存在
        boolean sdcardExist = Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);
        if(sdcardExist){
            sdcardDir = Environment.getExternalStorageDirectory();
        }
        return sdcardDir.toString();
    }
}
