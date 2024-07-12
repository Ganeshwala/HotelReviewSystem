package com.micro.ratingservice.controller;

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

import com.micro.ratingservice.entities.Rating;
import com.micro.ratingservice.services.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/save")
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating){
		Rating saveRating = ratingService.createRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveRating);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Rating>> fetchAllRating(){
		return ResponseEntity.ok(ratingService.getAllRating());
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> fetchRatigByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getAllRatingByUserId(userId));
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> fetchRatigByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getAllRatingByHotelId(hotelId));
	}
}
