package mahjong.server.mahjongapi.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

    public DBConnector(String url, String user, String pass) {
        final String sql = "SELECT * FROM room_base;";
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String uuid = rs.getString("room_id");
                String password = rs.getString("password");
                String roomComment = rs.getString("room_comment");
                System.out.println(uuid);
                System.out.println(password);
                System.out.println(roomComment);
            }
        } catch(SQLException e) {

        }
    }

}