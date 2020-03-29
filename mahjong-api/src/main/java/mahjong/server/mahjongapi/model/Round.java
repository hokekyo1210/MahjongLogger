package mahjong.server.mahjongapi.model;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class Round {
    private UUID roomId;
    private int gameId;
    private int roundId;
    private int ba;
    private int kyoku;
    private int honba;
    private Date createDate;
}
