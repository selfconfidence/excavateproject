package com.excavate.database;

import com.alibaba.druid.pool.DruidDataSource;
import com.excavate.utils.com.excavate.utils.Base64Utils;

public class MysqlDataSource extends DruidDataSource {

    @Override
    public void setUsername(String username) {
        String newUserName = null ;
        try {
            newUserName = Base64Utils.decode(username);
        }catch (Exception e){
            e.printStackTrace();
        }

        super.setUsername(newUserName);
    }

    @Override
    public void setPassword(String password) {
        String newPassword = null;
        try {
            newPassword = Base64Utils.decode(password);
        }catch (Exception e){
            e.printStackTrace();
        }
        super.setPassword(newPassword);
    }
     /* public static void main(String[] args) {
        //数据库账号密码!
        String userName= "root";
        String password = "root";
        try {
            String encode = Base64Utils.encode(userName.getBytes());
            System.out.println(encode);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
