package mahjong.server.mahjongapi.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import mahjong.server.mahjongapi.util.EnvironmentUtils;

public final class DBConnectorSample {
    // DB接続情報 環境変数
    private static final String ENV_DB_HOST_KEY = "DB_HOST";
    private static final String ENV_DB_USER_KEY = "DB_USER";
    private static final String ENV_DB_PASS_KEY = "DB_PASS";

    private static DBConnectorSample db;

    public static DBConnectorSample instance() {
        if(db != null){
            return db;
        }

        try {
            String host = EnvironmentUtils.get(ENV_DB_HOST_KEY);
            String user = EnvironmentUtils.get(ENV_DB_USER_KEY);
            String pass = EnvironmentUtils.get(ENV_DB_PASS_KEY);
            db = new DBConnectorSample(host, user, pass);
            return db;
        } catch(Exception ex) {
            throw new RuntimeException("DB接続に失敗しました。", ex);
        }
    }

    private Connection connection;

    private DBConnectorSample(String url, String user, String pass) throws SQLException {
        try {
            this.connection = DriverManager.getConnection(url, user, pass);
        } catch(SQLException e) {
            throw e;
        }
    }

    public List<Room> test() throws SQLException {
        final String sql = "SELECT * FROM room_base;";

        try(
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql)
        ) {
            List<Room> list = new ArrayList<Room>();

            while(rs.next()){
                Room room = new Room();
                String uuidStr = rs.getString("room_id");
                UUID uuid = UUID.fromString(uuidStr);
                room.setRoomId(uuid);

                String password = rs.getString("password");
                room.setPassword(password);

                String roomComment = rs.getString("room_comment");
                room.setRoomComment(roomComment);
                
                list.add(room);
            }
    
            return list;
        } catch(SQLException e) {
            throw e;
        }
    }

}