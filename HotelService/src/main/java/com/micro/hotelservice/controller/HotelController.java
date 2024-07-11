package com.micro.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.hotelservice.entity.Hotel;
import com.micro.hotelservice.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		Hotel newHotel = hotelService.storeHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(newHotel);
	}
	
	@GetMapping("/{hId}")
	public ResponseEntity<Hotel> findHotelWithId(@PathVariable String hId){
		Hotel hotel = hotelService.getHotelById(hId);
		return ResponseEntity.ok(hotel);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Hotel>> findAllHotel(){
		return ResponseEntity.ok(hotelService.getAllHotel());
	}
}
