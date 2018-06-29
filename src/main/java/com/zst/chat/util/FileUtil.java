package com.zst.chat.util;

import javax.imageio.stream.FileImageInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
public class FileUtil {

    /**
     * 将图片转为数组
     * @param path
     * @return
     */
    public static byte[] image2byte(String path){
        byte[] data = null;
        FileImageInputStream input = null;
        ByteArrayOutputStream output = null;
        try {
            input = new FileImageInputStream(new File(path));
            output = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int numBytesRead = 0;
            while ((numBytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, numBytesRead);
            }
            data = output.toByteArray();
        }
        catch (FileNotFoundException ex1) {
            ex1.printStackTrace();
        }
        catch (IOException ex1) {
            ex1.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }
}
