package com.micro.hotelservice.service.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.hotelservice.entity.Hotel;
import com.micro.hotelservice.repository.HotelRepository;
import com.micro.hotelservice.service.HotelService;

@Service
public class HotelServiceImp implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepo;

	@Override
	public Hotel storeHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		Hotel hotelDetail = hotelRepo.save(hotel);
		return hotelDetail;
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotelById(String hId) {
		return hotelRepo.findById(hId).orElseThrow();
	}

}
