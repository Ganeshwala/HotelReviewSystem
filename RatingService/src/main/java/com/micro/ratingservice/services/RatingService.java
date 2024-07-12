package com.micro.ratingservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.ratingservice.entities.Rating;

@Service
public interface RatingService {

	Rating createRating(Rating rate);
	
	List<Rating> getAllRating();
	
	//get all by UserID
	List<Rating> getAllRatingByUserId(String uId);
	
	//get All by hotelId
	List<Rating> getAllRatingByHotelId(String hotelId);
	
}
