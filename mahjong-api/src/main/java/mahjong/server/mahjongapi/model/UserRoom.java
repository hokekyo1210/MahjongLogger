package mahjong.server.mahjongapi.model;

import java.util.UUID;

import lombok.Data;

@Data
public class UserRoom {
    private String userId;
    private UUID roomId;
}
