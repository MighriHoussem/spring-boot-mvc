package com.training.mvc.mvcspringboot.service;

import com.training.mvc.mvcspringboot.data.RoomRepository;
import com.training.mvc.mvcspringboot.model.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
//    public static final List<Room> listRooms = new ArrayList<>();
//
//    static {
//        for(int i =0; i< 10 ; i++){
//            listRooms.add(new Room(i,"Room:"+ i,"Room Hotel" + i, "Room created on Controller"));
//        }
//    }

    private final RoomRepository roomRepository;
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    public List<Room> getRooms() {
        return this.roomRepository.findAll();
    }
}
