package com.example.mymall.utils;

import android.text.TextUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DigestUtils {

    /**
     * 加密
     * @param source 需要加密的字符串
     * @param encName  加密类型 sha1 sha128 sha256  md5
     * @return
     */
    public static String Encrypt(String source, String encName){
        if(TextUtils.isEmpty(source)) return "";
        MessageDigest messageDigest = null;
        String result = null;
        byte[] bytes = source.getBytes();
        try{
            if (!TextUtils.isEmpty(encName)) {
                messageDigest = MessageDigest.getInstance(encName);
            }else{
                messageDigest = MessageDigest.getInstance("SHA-256");
            }
            messageDigest.update(bytes);
            result = bytesToHex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
        return result;
    }

    /**
     * byte转hex
     * @param bts
     * @return
     */
    private static String bytesToHex(byte[] bts){
        String des = "";
        String tmp = null;
        for(int i=0;i<bts.length;i++){
            tmp = Integer.toHexString(bts[i]&0xFF);
            if(tmp.length() == 1){
                des += "0";
            }
            des += tmp;
        }
        return des;
    }

    /**
     * 获取签名前的有效数据字符串
     * 字符串组合按key的ASCII码从小到大排列然后拼接 data(key=valuekey=value)
     * @param dataMap
     * @return
     */
    public static String getSignSource(Map<String, String> dataMap){
        TreeMap<String, String> dataTree = new TreeMap<>();
        for(String key:dataMap.keySet()){
            dataTree.put(key,dataMap.get(key));
        }
        StringBuffer sb = new StringBuffer();
        Iterator<Map.Entry<String, String>> itData = dataTree.entrySet().iterator();
        while(itData.hasNext()){
            Map.Entry<String, String> entry = itData.next();
            sb.append(entry.getKey())
                    .append("=")
                    .append(entry.getValue());
        }

        return sb.toString();
    }

}
