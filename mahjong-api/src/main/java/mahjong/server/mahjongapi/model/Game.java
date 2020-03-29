package mahjong.server.mahjongapi.model;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class Game {
    private UUID roomId;
    private int gameId;
    private boolean isSanma;
    private Date createDate;
}
