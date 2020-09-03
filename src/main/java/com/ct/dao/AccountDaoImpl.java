package com.ct.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.ct.domain.Account;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chentiewen
 * @date 2020/9/3 - 10:44
 */
public class AccountDaoImpl implements AccountDao {

    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Account> findAll() {
        //使用jdbc
        //创建连接池
      /*  DruidDataSource dataSource = new DruidDataSource();
        //设置4个参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring_db");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");*/
        //定义对象
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet set = null;

        List<Account> list = new ArrayList<Account>();

        try {
            //获取连接
            conn = dataSource.getConnection();
            //编写sql，并预编译
            String sql = "select * from account";
            stmt = conn.prepareStatement(sql);
            //获取结果集
            set = stmt.executeQuery();
            //遍历结果集
            while (set.next()){
                Account account = new Account();
                account.setId(set.getInt("id"));
                account.setName(set.getString("name"));
                account.setMoney(set.getDouble("money"));

                list.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭连接
                conn.close();
                //关闭会话
                stmt.close();
                //关闭结果集
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

}
