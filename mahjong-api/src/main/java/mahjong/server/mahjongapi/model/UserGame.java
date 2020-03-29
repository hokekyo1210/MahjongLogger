package mahjong.server.mahjongapi.model;

import java.util.UUID;

import lombok.Data;

@Data
public class UserGame {
    private String userId;
    private UUID roomId;
    private int gameId;
    private int myWind;
}
