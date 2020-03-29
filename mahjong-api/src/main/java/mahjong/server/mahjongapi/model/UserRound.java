package mahjong.server.mahjongapi.model;

import java.util.UUID;

import lombok.Data;

@Data
public class UserRound {
    private String userId;
    private UUID roomId;
    private int gameId;
    private int roundId;
    private int score;
    private boolean isAgari;
    private boolean isRichi;
    private boolean isTenpai;
    private boolean isFuro;
    private boolean isHoju;
}
