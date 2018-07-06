package com.zst.chat.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Created by Ablert
 * on 2018/7/6.
 * @author Ablert
 */
public final class ByteBufferUtil {

    /**
     * 将字符串转为ByteBuffer
     * @param source
     * @return
     * @throws UnsupportedEncodingException
     */
    public static ByteBuffer convertStringToByteBuffer(String source) throws UnsupportedEncodingException {
        return ByteBuffer.wrap(source.getBytes("UTF-8"));
    }

    /**
     * 将字符串转为String
     * @param byteBuffer
     * @return
     */
    public static String convertByteBufferToString(ByteBuffer byteBuffer) {
        Charset charset = Charset.forName("UTF-8");
        return charset.decode(byteBuffer).toString();
    }
}
