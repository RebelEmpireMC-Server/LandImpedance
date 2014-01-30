package com.rebelempiremc.landimpedance.database;

import com.rebelempiremc.landimpedance.api.Quadrant;
import com.rebelempiremc.landimpedance.protection.PlayerProtection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MySQLDatabase {

    private Connection connection = null;
    private String url = null;
    private String user = null;
    private String password = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public volatile List<PlayerProtection> protections = new ArrayList<PlayerProtection>();

    public void read() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc://mysql://"+url+ "?user="+user+"&password"+password);
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * from LANDIMPEDANCE.PROTECTIONS");
        this.writeToProtections(resultSet);
    }

    public void writeToProtections(ResultSet set) throws Exception{
        while (set.next()){

        }
    }

    public void writeToMySQL(Map<Quadrant,List<PlayerProtection>> map){

    }
}
