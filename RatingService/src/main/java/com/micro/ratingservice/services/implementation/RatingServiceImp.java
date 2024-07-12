package com.micro.ratingservice.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.ratingservice.entities.Rating;
import com.micro.ratingservice.repository.RatingRepository;
import com.micro.ratingservice.services.RatingService;

@Service
public class RatingServiceImp implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rate) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rate);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getAllRatingByUserId(String uId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(uId);
	}

	@Override
	public List<Rating> getAllRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}

}
