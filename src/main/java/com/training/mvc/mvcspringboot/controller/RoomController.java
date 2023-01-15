package com.training.mvc.mvcspringboot.controller;

import com.training.mvc.mvcspringboot.model.Room;
import com.training.mvc.mvcspringboot.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

   @GetMapping
    public String getAllRooms (Model model) {
       List<Room> listRooms = this.roomService.getRooms();
        model.addAttribute("rooms", listRooms);
        return "rooms";
    }
    @GetMapping("/hotel")
    public String getHotelRooms(Model model) {
        return "hotel";
    }

}
