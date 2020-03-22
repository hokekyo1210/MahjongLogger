package mahjong.server.mahjongapi.controller;

import java.sql.SQLException;
import java.util.List;

import com.google.gson.Gson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mahjong.server.mahjongapi.model.DBConnector;
import mahjong.server.mahjongapi.model.Room;

@RestController
@RequestMapping("rooms")
public class RoomController {

    @RequestMapping(method = RequestMethod.GET)
    public String rooms() throws SQLException {
        // DBConnector con = new DBConnector("jdbc:postgresql://postgres:5432/postgres", "postgres", "test");
        DBConnector con = DBConnector.instance();
        List<Room> list = con.test();
        for(Room room : list){
            System.out.println(room);
        }

        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createRoom(){
        return "create Room";
    }

    @GetMapping(value = "/{roomId}")
    public String room(@PathVariable("roomId") String roomId) {
        return "room at " + roomId;
    }

    
}


