package mahjong.server.mahjongapi.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    public static List<Round> parse(ResultSet rs) throws SQLException {
        List<Round> result = new ArrayList<Round>();
        
        while(rs.next()) {
            Round round = new Round();
            round.roomId = UUID.fromString(rs.getString("room_id"));
            round.gameId = rs.getInt("game_id");
            round.roundId = rs.getInt("round_id");
            round.ba = rs.getInt("ba");
            round.kyoku = rs.getInt("kyoku");
            round.honba = rs.getInt("honba");
            round.createDate = rs.getDate("create_date");

            result.add(round);
        }

        return result;
    }
}
