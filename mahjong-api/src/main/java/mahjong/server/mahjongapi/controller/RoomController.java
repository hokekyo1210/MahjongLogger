package mahjong.server.mahjongapi.controller;

import java.sql.SQLException;
import java.util.List;

import com.google.gson.Gson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mahjong.server.mahjongapi.model.DBConnectorSample;
import mahjong.server.mahjongapi.model.Room;

@RestController
@RequestMapping("rooms")
public class RoomController {

    @RequestMapping(method = RequestMethod.GET)
    public String rooms() throws SQLException {
        // DBConnector con = new DBConnector("jdbc:postgresql://postgres:5432/postgres", "postgres", "test");

        final String sql = "SELECT * FROM room_base;";

        DBConnectorSample con = DBConnectorSample.instance();

        List<Room> list = con.execute(sql, Room::parse);

        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createRoom(
        @RequestParam("userId")String userId,
        @RequestParam("password")String password,
        @RequestParam("dPassword")String dPassword
    ) {
        Room room = new Room();
        room.setOwnerId(userId);
        room.setPassword(password);
        room.setDPassword(dPassword);

        return "create Room + " + new Gson().toJson(room);
    }

    @GetMapping(value = "/{roomId}")
    public String room(@PathVariable("roomId") String roomId) {
        return "room at " + roomId;
    }

    
}


