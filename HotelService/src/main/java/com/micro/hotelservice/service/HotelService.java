package com.micro.hotelservice.service;

import java.util.List;

import com.micro.hotelservice.entity.Hotel;

public interface HotelService {
	
	Hotel storeHotel(Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotelById(String hId);
}
