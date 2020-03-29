package mahjong.server.mahjongapi.model;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String userName;
    private String password;
}
