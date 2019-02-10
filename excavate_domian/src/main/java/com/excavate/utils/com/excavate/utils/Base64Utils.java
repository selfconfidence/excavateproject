package com.excavate.utils.com.excavate.utils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.io.IOException;
import java.util.Base64;

    /**
     * @author misterWei
     * @create 2019年01月26号:19点09分
     * @mailbox mynameisweiyan@gmail.com
     */
    public class Base64Utils {
        /**
         * Base64编码(依赖sun.misc.BASE64Decoder.jar)
         * @param data 要加密的字符数组
         * @return String 加密后的16进制字符串
         */
        public static String encode(byte[] data){
            return new BASE64Encoder().encode(data);
        }


        /**
         * Base64解码(依赖sun.misc.BASE64Decoder.jar)
         * @param data 要解密的字符串
         * @return String 解密后的字符串
         * @throws IOException
         */
        public static String  decode(String data) throws IOException {
            return new String(new BASE64Decoder().decodeBuffer(data));
        }

        /**
         * Base64编码(JDK1.8以后才能使用)
         * @param data 要加密的字符数组
         * @return String 加密后的16进制字符串
         */
        public static String encode_JDK18(byte[] data){
            return Base64.getEncoder().encodeToString(data);
        }

        /**
         * Base64解码(JDK1.8以后才能使用)
         * @param data 要解密的字符串
         * @return String 解密后的字符串
         * @throws IOException
         */
        public static String  decode_JDK18(String data) throws IOException {
            return new String(Base64.getDecoder().decode(data));
        }
}
