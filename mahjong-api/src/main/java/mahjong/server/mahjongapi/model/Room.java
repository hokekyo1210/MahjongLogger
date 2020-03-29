package mahjong.server.mahjongapi.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.seasar.doma.Entity;

import lombok.Data;

@Entity @Data
public class Room {
    private UUID roomId;
    private String ownerId;
    private String password;
    private String roomComment;
    private String dPassword;
    private Date createDate;

    public static List<Room> parse(ResultSet rs) throws SQLException {
        List<Room> result = new ArrayList<Room>();
        
        while(rs.next()) {
            Room room = new Room();
            room.roomId = UUID.fromString(rs.getString("room_id"));
            room.ownerId = rs.getString("owner_id");
            room.password = rs.getString("password");
            room.roomComment = rs.getString("room_comment");
            room.dPassword = rs.getString("d_password");
            room.createDate = rs.getDate("create_date");

            result.add(room);
        }

        return result;
    }

}
