package mahjong.server.mahjongapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rooms")
public class RoomController {

    @RequestMapping(method = RequestMethod.GET)
    public String rooms(){
        return "room";
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


