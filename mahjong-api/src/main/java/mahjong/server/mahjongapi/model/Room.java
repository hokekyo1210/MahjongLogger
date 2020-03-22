package mahjong.server.mahjongapi.model;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class Room {
    private UUID roomId;
    private String password;
    private String roomComment;
    private String ownerId;
    private Date createDate;

}
