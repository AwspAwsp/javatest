package com.hand.exam2;

import java.sql.*;

public class Csql {//数据库jdbc
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/javatest";
    String username = "root";
    String password = "wsp25314";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public  void getConnect(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    if (!conn.isClosed()) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
public void Getselect(String ID) throws SQLException {//1个查询
        Csql cq=new Csql();
        cq.getConnect();
        String countryID=ID;
        String sql="select Country_name from user where Country_ID ="+countryID;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()) {        //遍历结果集
        String username = rs.getString("username");
        System.out.println(username);
    }
}
    public void Getselect1(String ID) throws SQLException {//1个查询
        Csql cq=new Csql();
        cq.getConnect();
        String countryID=ID;
         String sql="select film from user where Country_ID ="+countryID +"order by datatime";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {        //遍历结果集
            String username = rs.getString("username");
            System.out.println(username);
        }
    }
}
