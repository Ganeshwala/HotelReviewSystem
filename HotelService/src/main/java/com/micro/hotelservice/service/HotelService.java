package com.micro.hotelservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.hotelservice.entity.Hotel;

@Service
public interface HotelService {
	
	Hotel storeHotel(Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotelById(String hId);
}
